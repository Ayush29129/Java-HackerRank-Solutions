import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result;
        char abc[] = a.toLowerCase().toCharArray();
        char xyz[] = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(abc);
        java.util.Arrays.sort(xyz);
        result =  java.util.Arrays.equals(abc,xyz);
        return result;

    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
