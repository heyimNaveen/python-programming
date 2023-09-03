import java.util.*;

public class max {
    public static void main(String args[]){
        int[] arr = {15,48,665,78,25};
        System.out.println(maxRange(arr, 3, 4));
    }

    static int maxRange(int[] arr,int start,int end){
        int maxVal = arr[0];
        for(int i=start;i<end;i++){
            if (arr[i]>maxVal){
                maxVal = arr[i];

            }


        }
        return maxVal;
    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>maxVal){
                maxVal = arr[i];

            }


        }
        return maxVal;
    }
    
}
