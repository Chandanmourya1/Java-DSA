
import java.util.*;
public class PrimeNum {

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        if (n==2){
            System.out.println("Prime Number");
        }else{
            boolean isPrime=true;
            for(int i=2;i<n-1;i++){
                if(n%i==0){
                    isPrime=false;
                }

            }
            if(isPrime==true){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not Prime");
            }
            
        }


     sc.close();
    }
}
