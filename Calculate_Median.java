import java.util.Arrays;
import java.util.Scanner;

public class Hackerrank {
    public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int arr1[] = new int[l1];
        int arr2[] = new int[l2];
        int total_len = l1 + l2;
        for(int i =0 ; i< l1 ; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i =0 ; i< l2 ; i++){
            arr2[i] = sc.nextInt();
        }


        int result[] = new int[l1+l2];
        System.arraycopy(arr1,0,result , 0,l1);
        System.arraycopy(arr2, 0 , result , l1,l2 );
        System.out.println(Arrays.toString(result));
        int n1 = total_len/2;
        float sum = (float)((result[n1] + result[n1-1])/2.0);
        System.out.println(sum);

    }}
