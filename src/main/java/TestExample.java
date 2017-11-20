import com.google.gson.*;
import com.oracle.javafx.jmx.json.JSONReader;
import jdk.nashorn.internal.parser.JSONParser;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
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

    public void fibonacci() {
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");

        for(int i = 0; i < 100; i++) {
            if(i == 0){
                System.out.println(first);
                continue;
            }

            if(i == 1) {
                System.out.println(second);
                continue;
            }

            BigInteger current = first.add(second);
            first = second;
            second = current;
            System.out.println(second);
        }

    }

    public boolean leapYearAlt(int year) {
        if (year %400 == 0) {
            return true;
        } else if (year %4 == 0 && year %100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindrome(String value) {
        String result = value.replaceAll("[-+.^:,' !]","");
        int start = 0;
        int end = result.length() -1;

        char[] chars = result.toLowerCase().toCharArray();

        for (int i = 0; i < end; i++) {
            if (chars[start + i] != chars[end - i]) {
                return false;
            }
        }

        return true;
    }

    public boolean containsDuplicates(String value) {
        char[] chars = value.toCharArray();
        boolean result = false;

        for(int i = 0; i < chars.length; i++) {
            for(int j = i+1; j < chars.length; j++) {
                if(chars[i] == chars[j]) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    public int consecutiveNumberPyramid(int row) {
        int result = 0;
        int rowNum = 0;

        for (int i = 1; i < row; i++) {
            rowNum = rowNum + i;
        }

        for (int i = 1; i <= row; i++) {
            result = result + (rowNum + i);
        }

        return result;
    }

    public String highAndLow(String num) {
        String[] chars = num.trim().split(" ");
        int high = Integer.valueOf(chars[0]);
        int low = Integer.valueOf(chars[0]);

        for (int i = 0; i < chars.length; i++) {
            int number = Integer.valueOf(chars[i]);
            if (high < number) {
                high = number;
            }

            if (low > number) {
                low = number;
            }
        }

        return high + " " + low;
    }

    public void getJsonFromUrl(String input) throws IOException {
        String u = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + input;

        URL url = new URL(u);
        BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));

        StringBuffer buffer = new StringBuffer();
        int read;
        char[] chars = new char[1024];

        while ((read = r.read(chars)) != -1) {
            buffer.append(chars, 0, read);
        }


        String jason = buffer.toString();

//        jason.
        String[] split = jason.split("Title\":\"([a-zA-Z0-9\\s\\:\\,\\']+)\",");

//        JSONParser jp = new JSONParser();

        int i = jason.indexOf("\"total_pages\":");
        int end = jason.indexOf(",\"data\":");

        int j = Integer.valueOf(jason.substring(i + 14, end));

        for(int count = 1; count <= j; count++) {

        }
    }
}

class Solution {
    /*
     * Complete the function below.
     */
    public static ArrayList<String> title = new ArrayList<>();
    public static int counter = 0;

    static String[] getMovieTitles(String substr) {
        String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr;
        StringBuffer response = new StringBuffer();
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //print result
        JsonElement jElement = new JsonParser().parse(response.toString());
        JsonObject jObject = jElement.getAsJsonObject();
        JsonArray jArray = jObject.getAsJsonArray("data");
        for (int i = 0; i < jArray.size(); i++) {
            jObject = jArray.get(i).getAsJsonObject();
            String result = jObject.get("Title").getAsString();
            title.add(result);
        }
        while (counter == 0) {
            counter++;
            getMovieTitles(substr + "&page=2");
        }
        Collections.sort(title);
        for (String s : title) {
            System.out.println(s);
        }
        System.out.println("Total number of tital is : " + title.size());
        String[] stringTitle = new String[title.size()];
        stringTitle = title.toArray(stringTitle);
        return stringTitle;
    }
}