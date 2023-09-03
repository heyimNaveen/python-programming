
import java.util.Scanner;

public class maxminof3nums {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter th First Number: ");
        int first = in.nextInt();

        System.out.println("Enter the Second Number: ");
        int second = in.nextInt();

        System.out.println("Enter the Third Number: ");
        int third = in.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.printf("largest Number is: %d ",largest);
        System.out.printf("smallest Number is:%d  ",smallest);
        
       
    }


        static int largest(int first,int second,int third){
            int max = first;
            if(second > max){
                max = second;
            }
            if(third > max){
                max = third;

            }
            return max;
        }

        static int smallest(int first,int second,int third){
            int min = first;
            if(min < second){
                min = second;
            }
            if(third<min){
                min = third;
            }
            return min;
        }







}
    

