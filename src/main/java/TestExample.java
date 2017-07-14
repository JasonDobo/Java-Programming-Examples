import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TestExample {

    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }

    public static boolean arrayCheck(int a[]) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean arrayCheckJava8(int a[]) {
        boolean found=false;
        Set<Integer> s = new HashSet<>();
        for (int name : a) {
            if (s.add(name) == found)
            {   System.out.println(name);
                found = true;
                return found;
            }
        }
        return found;
    }

    public static boolean streamArrys(Integer[] numbers) {
        boolean duplicate=false;
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
                .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
                .collect(Collectors.toSet());
        System.out.println(duplicates);
        if(duplicates.size()>0){
            duplicate = true;
            return duplicate;
        }
        return duplicate;
    }

    public int maxDiffAdjacentNumbers(int[] numbers) {
        if (numbers.length < 2) {
            return 0;
        }
        if (numbers.length == 2) {
            return Math.abs(numbers[1] - numbers[0]);
        }
        int max = Math.abs(numbers[1] - numbers[0]);
        for (int i = 2; i < numbers.length; i++) {
            int diff = Math.abs(numbers[i-1] - numbers[i]);
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }

    public int rowSumOddNumbers(int n) {
        int mid = n * n;
        int result = 0;

        if (mid % 2 == 0) {
            int count = n / 2;

            for (int i = 0; i < count; i++) {
                result = result + (2 * mid);
            }
        } else {
            int count = (n - 1) / 2;
            result = result + mid;

            for (int i = 0; i < count; i++) {
                result = result + (2 * mid);
            }
        }

        return result;
    }

    public int rowSumOddNumbersMath(int n) {
        return n * n * n;
    }

    public Boolean leapYear(int y) {
        if (y == 0) {
            return false;
        } else if (y %400 == 0) {
            return true;
        } else if (y %4 == 0 && y %100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxDiffForNumbersInArray(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }

        return max - min;
    }
}
