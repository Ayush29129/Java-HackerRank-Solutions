import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char ch[] = A.toCharArray();
        char ch1[] = new char[A.length()];
        String temp = A;
        int j=0,flag=0;
        for(int i=A.length()-1;i>=0;i--){
                ch1[j]=ch[i];
                j++;
        }
        for(int i=0;i<A.length();i++){
            if(ch[i]==ch1[i]){
                flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.print("Yes");
        else
            System.out.print("No");

        
    }
}
