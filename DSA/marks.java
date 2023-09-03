import java.util.Scanner;

public class marks {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // input from user
        System.out.print("Enter The marks obtained out of 100: ");
        int marks = in.nextInt();

        Grade( marks);

        


    }

    static void Grade(int marks){
        if(marks >=91 ){
            System.out.println("AA");
        }
        else if(marks >=81){
            System.out.println("AB");
        }
        else if(marks >=71){
            System.out.println("BB");
        }
        else if(marks >=61){
            System.out.println("BC");
        }
        else if(marks >=51){
            System.out.println("CD");
        }
        else if(marks >=41){
            System.out.println("DD");
        }
        else{
            System.out.println("Fail");
        }

    }
     

    
    
}
