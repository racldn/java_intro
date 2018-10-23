import static org.junit.Assert.*;
import org.junit.Test;

public class JavaBuzzTDDTest {

    @Test
    public void ChecksForJava() {
        String output = JavaBuzzTDD.check(3);
        assertEquals("Java", output);

    }

    @Test
    public void ChecksForBuzz() {
        String output = JavaBuzzTDD.check(5);
        assertEquals("Buzz", output);
    }

    @Test
    public void ChecksForJavaBuzz() {
        String output = JavaBuzzTDD.check(15);
        assertEquals("JavaBuzz", output);
    }

    @Test
    public void ChecksForNoChange() {
        String output = JavaBuzzTDD.check(7);
        assertEquals("7", output);
    }

}