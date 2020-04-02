import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s = s.trim();
        if(s.equals("") || s == null){
            System.out.println("0");
            return;
        }
        
         String str[] = s.split("[^a-zA-Z]+");
        System.out.println(str.length);
        for(String a : str){
            System.out.println(a);
        }
        scan.close();
       
    }
}

