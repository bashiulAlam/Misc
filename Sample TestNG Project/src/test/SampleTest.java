import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    String message = "Hello World";
    Sample messageUtil = new Sample(message);

    @Test
    public void testPrintMessage() {
        Assert.assertEquals(message, messageUtil.printMessage());
    }
}