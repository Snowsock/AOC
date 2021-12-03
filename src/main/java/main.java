import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        December1 d1 = new December1("/home/inge/git/AOC/src/main/resources/dec1");
        December2 d2 = new December2("/home/inge/git/AOC/src/main/resources/dec2");

        System.out.println("December1, first star; " + d1.firstStar());
        System.out.println("December1, second star; " + d1.secondStar());
        System.out.println("December2, first star: "+ d2.firstStar());
        System.out.println("d2.secondStar() = " + d2.secondStar());
    }
}
