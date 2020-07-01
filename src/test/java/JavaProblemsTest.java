import org.junit.Test;
import static org.junit.Assert.*;

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
}
