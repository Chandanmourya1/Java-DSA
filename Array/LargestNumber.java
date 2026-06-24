package Array;

public class LargestNumber {
    public static int getLargest(int numbers[]){
        int Largest =Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(Largest<numbers[i]){
                Largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest= numbers[i];
            }
        }
        System.out.println("Smallest Number is : "+smallest);
        return Largest;
    }
    public static void main(String[]args){
        int numbers[]={1,3,5,7,3,8};
        System.out.println("Largest Number is : " +getLargest(numbers));
    }  
}
