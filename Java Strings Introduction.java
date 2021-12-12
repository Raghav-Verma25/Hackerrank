import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l1 = A.length();
        int l2 = B.length();
        System.out.println(l1+l2);
        int c=0;
        for( int i =0 ; i<l1+l2  ; i++ ){
            if ( A.charAt(i) <  B.charAt(i)){
            System.out.println("No");
            break;
         }
         
         if( A.charAt(i)== B.charAt(i)){
             c=c+1;
             
         }
         
          if ( A.charAt(i) >  B.charAt(i)){
            System.out.println("Yes");
            break;
         }
         
         if(c==l1){
              System.out.println("No");  
              break;
         }
        }
        
        String s1 = A.substring(0,1).toUpperCase();
        String s2 = B.substring(0,1).toUpperCase();
        System.out.println(s1+A.substring(1) +" "+ s2+B.substring(1));
        
    }
}



