import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i =0 ; i< size ; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        
        int test = sc.nextInt();
        
            for(int i =0 ; i< test ; i++){ 
                String str = sc.next();
                if(str.equals("Insert")){ 
                    int index = sc.nextInt();
                    int num1 = sc.nextInt();
                    list.add(index , num1);
                }
                if(str.equals("Delete")){ 
                    int index = sc.nextInt();
                    list.remove(index);
                }               
               
        }
        //System.out.print(list);
        for(int p : list){ 
            System.out.print(p+" ");
        }
        
    }
}
