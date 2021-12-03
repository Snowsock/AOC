import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class december3test {

    @Test
    void firstStarTest() throws IOException {
        December3 d3 = new December3("/home/inge/git/AOC/src/test/java/testd3");
        assertEquals(198, d3.firstStar());
    }
}
