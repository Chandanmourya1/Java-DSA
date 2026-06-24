// package LOOP;
import java.util.*;
public class Continue {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        // do{
        //     System.out.println("Enter the Number");
        //     int n=sc.nextInt();
        //     if(n%10==0){
        //         continue;
        //     }
        //     System.out.println("Number was:"+n);
          
            
   
        // } 
        // while(true);
        
         
        
    
         for (int i=0;i<=10;i++){
             if (i==5){
                 continue;
             }
             System.out.println(i);
         }
       
    sc.close();
    }
}
