import java.util.Scanner;


public class voting18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = in.nextInt();

        if(age >= 18 ){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not Eligible to Vote");
        }


    }

  
    
}
