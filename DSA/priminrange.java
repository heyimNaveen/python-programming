import java.util.Scanner;

public class priminrange {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //input
        System.out.print("Enter the Lower bound of the Interval: ");
        int a = in.nextInt();

        System.out.print("Enter the Upper bound of the Interval: ");
        int b = in.nextInt();

        

        

        int flag;
        for(int i =a ; i <=b;i++){
            if(i==1||i==0){
                continue;
            }
            flag =1;

            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag = 0;
                    break;
                }
            }

            if(flag == 1 ){
                System.out.println((i));
            }


        }
    }
}
