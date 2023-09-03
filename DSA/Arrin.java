import java.util.Scanner;
import java.util.Arrays;

public class Arrin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int arr[] = new int[5];
        // //input
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = in.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));


        // // //output
        // // for(int i=0;i<arr.length;i++){
        // //     System.out.print(arr[i] + " ");
        // // }

        // for(int num : arr){
        //     System.out.print(num + " ");
        // }


        String[] str = new String[5];
        for(int i=0;i<str.length;i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        str[1] = "Naveen";

        System.out.println(Arrays.toString(str));

    }
    
}
