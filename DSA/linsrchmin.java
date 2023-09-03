public class linsrchmin {
    public static void main(String args[]){
        int[] arr = {78,8,6,5,7,35};
        int target = 5;

        System.out.println(linearsrch(arr, target, 1, 4));
    }

    static int linearsrch(int[] arr,int target,int start,int end){
        if(arr.length ==0){
            return -1;

        }

        for(int index = start;index <= end;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }

        }
        return -1;

    }
    
}
