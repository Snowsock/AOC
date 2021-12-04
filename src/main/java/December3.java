import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class December3 implements AOC{

    ArrayList<String> input = new ArrayList<>();
    int strLength;

    public December3(String s) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(s));
        String str;
        while((str = br.readLine()) != null){
            strLength = str.length();
            input.add(str);
        }

    }

    @Override
    public int firstStar(){
        int bound = input.size() / 2;
        String gamma = "";
        String epsilon = "";
        for(int i = 0 ; i < strLength ; ++ i){
            int countOne = 0;
            for(int j = 0; j < input.size(); ++j) {
                char a = input.get(j).charAt(i);
                if (a == '1') {
                    countOne++;
                }
            }
            if (countOne > bound) {
                gamma += '1';
                epsilon += '0';
            } else {
                gamma += '0';
                epsilon += '1';
            }
        }

        return Integer.parseInt(gamma,2)* Integer.parseInt(epsilon,2);
    }

    @Override
    public int secondStar() throws IOException {
        return 0;
    }
}
