package hackerRank;




import java.util.*;
import java.io.*;

public class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int[][] arr= new int[t][n];
            
            int sum = a+b;
            
            arr[i][0]=sum;
            
            for(int j=0;j<n-1;j++) {
            	arr[i][j]+=(b*(int)Math.pow(2, j));
            	
            	System.out.print(arr[i][j]+" ");
            }
            
            System.out.println();
            
            
            
        }
        in.close();
    }
}