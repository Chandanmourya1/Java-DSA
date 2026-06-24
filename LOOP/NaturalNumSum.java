
import java.util.*;

public class NaturalNumSum {
    public static void main(String[]arga){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int sum=0;
        int i= 1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is:" +sum);

    sc.close();

    }
    
}
