import java.io.*;
import java.util.Scanner;

public class sumofnnatnums {
    public static int findsum(int n){
        int sum =0;
        for(int x = 1;x<=n;x++){
            sum = sum + x;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        //input
        System.out.print("Enter the Number(n): ");
        int n = in.nextInt();

        System.out.println(findsum(n));

    }
    
}
