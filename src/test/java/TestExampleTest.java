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
        testExample = null;
    }

    @Test
    public void reverse() throws Exception {
        System.out.println("Reverse a String which is passed in");

        Assert.assertTrue(testExample.reverse("Message").equalsIgnoreCase("egasseM"));
        Assert.assertTrue(testExample.reverse("Test Message").equalsIgnoreCase("egasseM tseT"));
        Assert.assertTrue(testExample.reverse("a").equalsIgnoreCase("a"));
        Assert.assertTrue(testExample.reverse("").equalsIgnoreCase(""));
        Assert.assertTrue(testExample.reverse("123").equalsIgnoreCase("321"));
    }

    @Test
    public void reverseIt() throws Exception {
        System.out.println("Reverse a String which is passed in");

        Assert.assertTrue(testExample.reverseIt("Message").equalsIgnoreCase("egasseM"));
        Assert.assertTrue(testExample.reverseIt("Test Message").equalsIgnoreCase("egasseM tseT"));
        Assert.assertTrue(testExample.reverseIt("a").equalsIgnoreCase("a"));
        Assert.assertTrue(testExample.reverseIt("").equalsIgnoreCase(""));
        Assert.assertTrue(testExample.reverseIt("123").equalsIgnoreCase("321"));
    }

    @Test
    public void arrayCheck() throws Exception {
        System.out.println("Check if a array contains any duplicate values");

        int a[] =  {4,5,10,4,5};
        Assert.assertTrue(testExample.arrayCheck(a));
        int b[] =  {4,5,10,9,5};
        Assert.assertTrue(testExample.arrayCheck(b));
        int c[] =  {4,5,-10,9,-5};
        Assert.assertFalse(testExample.arrayCheck(c));
        int d[] =  {4,5,10,9,15};
        Assert.assertFalse(testExample.arrayCheck(d));
    }

    @Test
    public void arrayCheckJava8() throws Exception {
        System.out.println("Check if a array contains any duplicate values");

        int a[] =  {4,5,10,4,5};
        Assert.assertTrue(testExample.arrayCheckJava8(a));
        int b[] =  {4,5,10,9,5};
        Assert.assertTrue(testExample.arrayCheckJava8(b));
        int c[] =  {4,5,-10,9,-5};
        Assert.assertFalse(testExample.arrayCheckJava8(c));
        int d[] =  {4,5,10,9,15};
        Assert.assertFalse(testExample.arrayCheckJava8(d));
    }

    @Test
    public void streamArrys() throws Exception {
        System.out.println("Check if a array contains any duplicate values");

        Integer[] a = new Integer[] { 1, 2, 1, 3, 4, 4 };
        Assert.assertTrue(testExample.streamArrys(a));
        Integer[] b = new Integer[] { 1, 2, 5, 3, 4, 4 };
        Assert.assertTrue(testExample.streamArrys(b));
        Integer[] c = new Integer[] { 1, 2, -1, 3, -4, 4 };
        Assert.assertFalse(testExample.streamArrys(c));
        Integer[] d = new Integer[] { 1, 2, 7, 3, 9, 4 };
        Assert.assertFalse(testExample.streamArrys(d));
    }

    @Test
    public void maxDiff() throws Exception {
        System.out.println("Calculate the maximum difference between two adjacent numbers in the array which is passed in");
        int [] numbers = {12, 8, 34, 10, 59};
        Assert.assertEquals(49, testExample.maxDiffAdjacentNumbers(numbers));

        int [] numbers2 = {-50, 100, 20, -40};
        Assert.assertEquals(150, testExample.maxDiffAdjacentNumbers(numbers2));
    }
}