import java.lang.reflect.Field;
import org.apache.commons.lang3.math.NumberUtils;

public class JavaProblems {

    public static String returnHelloWorld() {
        return "Hello World";
    }

    public static int addInts(int n1, int n2) {
        return n1 + n2;
    }

    public static long intToLong(int num) {
        long newNum = num;
        return newNum;
    }

    public static void main(String[] args) {
        long num = 44;
        int x = 44;
        if ((int)x == (long)num) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
