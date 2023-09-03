import java.util.Scanner; 

public class fact {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //input
        System.out.print("Enter a number: ");
        double num = in.nextInt();

        Factorial(num);


    }
    static void Factorial(double num){
        double fact = 1;
        for(double i =1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is : "+ fact);
        

    }


    
}
