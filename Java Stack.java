import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        String x = sc.next();
        Stack<Character> s = new Stack<>();
        for(int i =0 ; i< x.length() ; i++){
        if(x.charAt(i)=='{' || x.charAt(i)=='[' || x.charAt(i)=='('){ 
            s.push(x.charAt(i));
        }
            else if(!s.empty() && ((x.charAt(i)=='}' && s.peek()=='{') ||(x.charAt(i)==']' && s.peek()=='[')|| (x.charAt(i)==')' && s.peek()=='(' ))  ){ 
            
            s.pop();
        }
        else{ 
            s.push(x.charAt(i));
        }
        
        
        }
        if(s.empty()){ 
           System.out.println("true");
        }
        else{ 
            System.out.println("false");
        }
    }}
}
