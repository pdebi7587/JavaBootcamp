package hackerRank;




import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char [] B = new char[A.length()];
        char [] C = new char[B.length];
      
        B = A.toCharArray();

        for (int i=0, j=B.length-1; i<B.length; i++, j--){
            C[i] = B[j];

        }

        if (B == C){
            System.out.println("yes");
            
        }

        else{
            System.out.println("no");
        }

    System.out.println(Arrays.toString(A));
    System.out.println(Arrays.toString(C));


    }
}
