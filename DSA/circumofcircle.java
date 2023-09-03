import java.util.Scanner;

public class circumofcircle {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //input og radius
        System.out.print("Enter the radius of circle: ");
        int radius = in.nextInt();

        //calling the circumference function
        circumference(radius);

    }
    //circle circumference function
    static void circumference(int radius){
        double circum = (2*radius*3.14);
        System.out.println("Circumference of the circle is: "+ circum);

    }
    
    
}
