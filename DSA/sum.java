import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //input first number
        System.out.print("Enter first Number: ");
        int a = in.nextInt();

        System.out.print("Enter Second Number: ");
        int b = in.nextInt();

        
        SumNum(a,b);


    }
    //sum function
    static void SumNum(int a,int b){
        int sum = (a + b);
        System.out.println("Sum of two numbers is:"+sum);

    }
    
}
