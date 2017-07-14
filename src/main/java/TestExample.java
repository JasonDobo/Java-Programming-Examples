import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class TestExample {

    public static void main(String [ ] args){
        arrayCheckJava8();
        arrayCheck();
        System.out.println(reverse("hello there"));
        System.out.println(reverseIt("hello there"));
        String string="hello there";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);

        System.out.println("Please enter a string");
        Scanner in = new Scanner(System.in);
        String inpStr = in.nextLine();
        System.out.println("Original String :" + inpStr);
        char temp;
        char[] arr = inpStr.toCharArray();
        int len = arr.length;
        for(int i=0; i<(inpStr.length())/2; i++,len--){
            temp = arr[i];
            arr[i] = arr[len-1];
            arr[len-1] = temp;
        }

        System.out.println("Reverse String :" + String.valueOf(arr));

        String[] array = {"earth", "mars", "mercury"};
        Arrays.stream(array).map(s -> new StringBuilder(s).reverse().toString()).forEach(System.out::println);
    }

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

    public static boolean arrayCheck(){
        int a[] =  {4,5,10,4,5};
        int b;
        boolean found = false;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]==a[j]){
                    return found = true;
                }
            }
        }
        return found;
    }

    public static boolean arrayCheckJava8(){
        boolean found=false;
        int a[] =  {4,5,10,4,5};
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

    public static boolean streamArrys(){
        boolean duplicate=false;
        Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
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
}
