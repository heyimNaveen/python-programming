import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        //input
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
            
        // get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));  //pass index here
        }


    //     list.add(25);
    //     list.add(5);
    //     list.add(22555);
    //     list.add(2554);
    //     list.add(6564125);
    //     list.add(614425);
    //     list.add(2545);

    // //    System.out.println(list.contains(2554484));

    //     System.out.println(list);
    //     list.set(1,99);
    //     list.remove(2);
    //     System.out.println(list);


    

    }
    
}
