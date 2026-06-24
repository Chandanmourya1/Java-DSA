
import java.util.*;

public class PrintNum {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number n");
        int range =sc.nextInt();
        int counter= 1;
        while(counter<=range){
            System.out.println(counter);
            counter++;
        }sc.close();
    }
    
}
