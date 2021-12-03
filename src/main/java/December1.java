import java.io.*;
import java.util.ArrayList;

public class December1 implements AOC {
    private final ArrayList<Integer> depth = new ArrayList<>();

    public December1(String filepath) throws IOException {
        File file = new File(filepath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st = br.readLine()) != null){
            depth.add(Integer.parseInt(st));
        }
        br.close();
    }

    @Override
    public int firstStar(){
        int counter = 0;
        for(int i = 0; i < depth.size()-1; ++i){
            if(depth.get(i) < depth.get(i+1))
                ++counter;
        }
        return counter;
    }

    @Override
    public int secondStar(){
        int counter = 0;
        for(int i = 0; i < depth.size()-3; ++i){
            int sum1 = depth.get(i) + depth.get(i+1) + depth.get(i+2);
            int sum2 = depth.get(i+1) + depth.get(i+2) +depth.get(i+3);
            if(sum1<sum2)
                ++ counter;
        }
        return counter;
    }
}
