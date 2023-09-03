import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 236;
        arr[3] = 354;
        arr[4] = 49;
        System.out.println(arr[2]);


        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }


        for(int i=0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
