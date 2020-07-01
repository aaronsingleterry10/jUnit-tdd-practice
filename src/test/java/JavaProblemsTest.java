import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.math.NumberUtils;


public class JavaProblemsTest {

    @Test
    public void testHelloWorld() {
        assertEquals("Hello World", JavaProblems.returnHelloWorld());
    }

    @Test
    public void testAddInts() {
        int expected = 10;
        int actual = JavaProblems.addInts(5, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntToLong() {
        long expected = 33;
        long actual = JavaProblems.intToLong(33);
        assertEquals(expected, actual);
    }

    public static void main(String[] args) {
        long num = 44;
        int x = 44;
        if (x == (int) x) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
