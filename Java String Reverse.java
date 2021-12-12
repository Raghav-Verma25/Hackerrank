import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String word="";
        for(int i=A.length()-1; i>=0 ; i--){ 
            word = word + A.charAt(i) ;
        }
        String c = word.toString();
       if(A.equals(c)){ 
           System.out.println("Yes");
       }
        else{ 
            System.out.println("No");
        }
    }
}



