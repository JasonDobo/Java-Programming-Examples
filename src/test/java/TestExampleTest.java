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
    public void wiki() throws Exception {
        int i = testExample.getTopicCount2("pizza");
        int j = testExample.getTopicCount("pizza");
        Assert.assertTrue(i==j);
    }

    @Test
    public void stepPyramid() throws Exception {
        Assert.assertEquals(testExample.stepNumberPyramid(1), 1);
        Assert.assertEquals(testExample.stepNumberPyramid(2), 2);
        Assert.assertEquals(testExample.stepNumberPyramid(3), 7);
        Assert.assertEquals(testExample.stepNumberPyramid(4), 11);
        Assert.assertEquals(testExample.stepNumberPyramid(5), 24);
        Assert.assertEquals(testExample.stepNumberPyramid(6), 33);
        Assert.assertEquals(testExample.stepNumberPyramid(7), 58);
        Assert.assertEquals(testExample.stepNumberPyramid(8), 74);
        Assert.assertEquals(testExample.stepNumberPyramid(9), 115);
        Assert.assertEquals(testExample.stepNumberPyramid(97), 116473);
        Assert.assertEquals(testExample.stepNumberPyramid(213), 1219372);
        // 1 = 1 + 1
        // 2 = 2 + 1
        // 3 4 = 7 + 2
        // 5 6 = 11 + 2
        // 7 8 9 = 24 + 3
        // 10 11 12 = 33 + 3
        // 13 14 15 16 = 58 + 4
        // 17 18 19 20 = 74 + 4
        // 21 22 23 24 25 = 115 + 5
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

    @Test
    public void oddNumbers()  throws Exception {
        Assert.assertEquals(testExample.rowSumOddNumbers(3), 27);
    }

    @Test
    public void oddNumbersBest()  throws Exception {
        Assert.assertEquals(testExample.rowSumOddNumbersMath(3), 27);
    }

    @Test
    public void leapYear() throws Exception {
        Assert.assertTrue(testExample.leapYear(1904));
        Assert.assertFalse(testExample.leapYear(1900));
        Assert.assertTrue(testExample.leapYear(2000));
        Assert.assertFalse(testExample.leapYear(1954));
        Assert.assertFalse(testExample.leapYear(0));
    }

    @Test
    public void largestDiff() throws Exception {
        int[] a =  {1, 100, 2, 105, -10, 30, 100};
        Assert.assertEquals(115, testExample.maxDiffForNumbersInArray(a));
        int[] b = {1, 100, 2, 105, 10, 30, 80};
        Assert.assertEquals(104, testExample.maxDiffForNumbersInArray(b));
    }

    @Test
    public void Fib() throws Exception {
        testExample.fibonacci();
    }

    @Test
    public void palindrome() throws Exception {
        String test = "Madam in Eden, I'm Adam";
        Assert.assertTrue(testExample.isPalindrome(test));
        test = "Was founded with a single purpose";
        Assert.assertFalse(testExample.isPalindrome(test));
        test = "A man, a plan, a canal - Panama!";
        Assert.assertTrue(testExample.isPalindrome(test));
        test = "Pull up, Eva, we're here, wave, pull up";
        Assert.assertTrue(testExample.isPalindrome(test));
        test = "Madam in Edan, I'm Adam";
        Assert.assertFalse(testExample.isPalindrome(test));
    }

    @Test
    public void duplicateLetters() throws Exception {
        System.out.println("Check if a string contains any duplicate values");

        Assert.assertFalse(testExample.containsDuplicates("earth"));
        Assert.assertTrue(testExample.containsDuplicates("babylon"));
        Assert.assertTrue(testExample.containsDuplicates("europe"));
        Assert.assertFalse(testExample.containsDuplicates("care"));
    }

    @Test
    public void numberPyramid() throws Exception {
        Assert.assertEquals(testExample.consecutiveNumberPyramid(1), 1);
        Assert.assertEquals(testExample.consecutiveNumberPyramid(2), 5);
        Assert.assertEquals(testExample.consecutiveNumberPyramid(3), 15);
        Assert.assertEquals(testExample.consecutiveNumberPyramid(4), 34);
        Assert.assertEquals(testExample.consecutiveNumberPyramid(5), 65);
        Assert.assertEquals(testExample.consecutiveNumberPyramid(6), 111);
        Assert.assertEquals(testExample.consecutiveNumberPyramid(14), 1379);
        Assert.assertEquals(testExample.consecutiveNumberPyramid(99), 485199);
    }

    @Test
    public void highAndLow() throws Exception {
        Assert.assertTrue(testExample.highAndLow("1 2 3 4 5").equals("5 1"));
        Assert.assertTrue(testExample.highAndLow("1 2 -3 4 5").equals("5 -3"));
        Assert.assertTrue(testExample.highAndLow("1 9 3 4 -5").equals("9 -5"));
        Assert.assertTrue(testExample.highAndLow("14 9 3 4 12").equals("14 3"));
    }

    @Test
    public void stream() throws Exception {
        testExample.getJsonFromUrl("spiderman");
    }
}
