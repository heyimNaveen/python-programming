public class linMin {
    public static void main(String args[]){
        int[] arr = {78,8,6,5,7,35};
        System.out.println(findmin(arr));
        
    }

    static int findmin(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr [i];
            }
        }
        return ans;


    }
    
}
