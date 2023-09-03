import java.util.Scanner;

public class primeornot {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //input
        System.out.print("Enter the Number to Check if it is Prime or Not: ");
        int num = in.nextInt();

        boolean isPrime =Prime(num);

        if(isPrime){
            
             System.out.println(num + " is a prime number");
        }
        else{
            
             System.out.println(num + " is not a prime");
        }


    }
    static boolean Prime(int num){
        if(num <=1 ){
            return false;
        }
        for(int i=2;i <= num/2;i++){
            if(num % i == 0){
                return false;
            }
            
        }
        return true;
    }
    
}
