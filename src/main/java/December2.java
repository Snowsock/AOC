import java.io.*;

public class December2 implements AOC {

    String filepath;

    public December2(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public int firstStar() throws IOException {
        int horizontalPosition = 0;
        int depth = 0;
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        String str;
        int temp;
        while((str = br.readLine()) != null){
            //System.out.println(str);
            String[] s = str.split(" ");
            String dir = s[0];
            switch (dir){
                case "forward":
                    temp = horizontalPosition;
                    horizontalPosition = temp + Integer.parseInt(s[1]);
                    break;
                case "up":
                    temp = depth;
                    depth = temp - Integer.parseInt(s[1]);
                    break;
                case "down":
                    temp = depth;
                    depth = temp + Integer.parseInt(s[1]);
                    break;
            }
        }
        br.close();
        return horizontalPosition * depth;
    }

    @Override
    public int secondStar() throws IOException {
        int horizontalPosition = 0;
        int depth = 0;
        int aim = 0;
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        String str;
        int temp;
        while((str = br.readLine()) != null){
            //System.out.println(str);
            String[] s = str.split(" ");
            String dir = s[0];
            int number = Integer.parseInt(s[1]);
            switch (dir){
                case "forward":
                    temp = horizontalPosition;
                    horizontalPosition = temp + number;
                    depth = depth + (aim * number);
                    //System.out.println("depth = " + depth);
                    break;
                case "up":
                    aim = aim - number;
                    //System.out.println("aim = " + aim);
                    break;
                case "down":
                    aim = aim + number;
                    //System.out.println("aim = " + aim);
                    break;
            }
        }

        br.close();
        return horizontalPosition * depth;
    }
}
