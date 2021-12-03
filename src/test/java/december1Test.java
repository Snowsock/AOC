import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class december1Test {

    @Test
    void firstStarTest() throws IOException {
        December1 d1 = new December1("//home//inge//git//AOC//src//test//java//testd1");
        assertEquals(7, d1.firstStar());
    }

    @Test
    void secondStarTest() throws IOException {
        December1 d1 = new December1("//home//inge//git//AOC//src//test//java//testd1");
        assertEquals(5, d1.secondStar());
    }
}
