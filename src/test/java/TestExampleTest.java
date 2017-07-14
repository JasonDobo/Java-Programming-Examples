import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestExampleTest {

    TestExample testExample;

    @Before
    public void setUp() throws Exception {
        testExample = new TestExample();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() throws Exception {
        Assert.assertTrue(testExample.reverse("Message").equalsIgnoreCase("egasseM"));
        Assert.assertTrue(testExample.reverse("Test Message").equalsIgnoreCase("egasseM tseT"));
        Assert.assertTrue(testExample.reverse("a").equalsIgnoreCase("a"));
        Assert.assertTrue(testExample.reverse("").equalsIgnoreCase(""));
        Assert.assertTrue(testExample.reverse("123").equalsIgnoreCase("321"));
    }

    @Test
    public void reverseIt() throws Exception {
        Assert.assertTrue(testExample.reverseIt("Message").equalsIgnoreCase("egasseM"));
        Assert.assertTrue(testExample.reverseIt("Test Message").equalsIgnoreCase("egasseM tseT"));
        Assert.assertTrue(testExample.reverseIt("a").equalsIgnoreCase("a"));
        Assert.assertTrue(testExample.reverseIt("").equalsIgnoreCase(""));
        Assert.assertTrue(testExample.reverseIt("123").equalsIgnoreCase("321"));
    }

    @Test
    public void arrayCheck() throws Exception {
    }

    @Test
    public void arrayCheckJava8() throws Exception {
    }

    @Test
    public void streamArrys() throws Exception {
    }

}