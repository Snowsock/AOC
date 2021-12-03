import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class december2test {

    @Test
    void december2OneStar() throws IOException {
        December2 d2 = new December2("//home//inge//git//AOC//src//test//java//testd2");
        assertEquals(150, d2.firstStar());
    }

    @Test
    void december2TwoStar() throws IOException {
        December2 d2 = new December2("//home//inge//git//AOC//src//test//java//testd2");
        assertEquals(900, d2.secondStar());
    }
}
