
import java.util.*;

public class Factorial {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= sc.nextInt();

        int factorial=1;
        if(n<0){
            System.out.println("Factorial is not defined for Negative Number");
        }else{
            for(int i=1;i<=n; i++){
                factorial=factorial*i;
            }
            System.out.println(" Factorial of " + n + " is: " +factorial);
        }
       
    sc.close();
    }
    
}
