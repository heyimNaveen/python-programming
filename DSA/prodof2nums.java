import java.util.Scanner;
public class prodof2nums {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("Enter the first Number: ");
        int c = in.nextInt();

        System.out.print("Enter the second number: ");
        int d = in.nextInt();

        //calling product function
        Product(c,d);

    }

    //product function

    static void Product(int c,int d){
        int mul = (c * d);
        System.out.println("Product of two Numbers is: " + mul);
    }
    
}
