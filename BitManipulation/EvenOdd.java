package BitManipulation;

public class EvenOdd {
    public static void EvenOrOdd(int n){
        int BitMask= 1;
        if((n & BitMask)==0){
            System.out.println("Even");

        }else{
            System.out.println("Odd");
        }
       

        
    }
    public static void main(String[]args){
        int n=10;
        EvenOrOdd(n);


    }
    
}
