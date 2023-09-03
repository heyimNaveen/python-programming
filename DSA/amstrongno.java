import java.util.Scanner;

public class amstrongno {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // System.out.println(isamstrong(n));
        for (int i =100;i<999;i++){
            if(isamstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }

    static boolean isamstrong(int n){
        int original = n;
        int sum =0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
    
}
