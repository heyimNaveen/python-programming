import java.util.Scanner;
public class evenorodd {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check the number Even or Odd : ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is Even Number");
        }

        else{
            System.out.println("The number Is Odd Number");
        }

    }
    
}
