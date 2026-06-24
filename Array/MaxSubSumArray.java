package Array;
public class MaxSubSumArray {
    public static void Maxsubarray(int[] numbers){
        int MaxSum=Integer.MIN_VALUE;
        int currentSum=0;
        int prefix[]= new int [numbers.length];
        prefix[0]=numbers[0];
//calculate Prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if(MaxSum<currentSum){
                    MaxSum=currentSum;
                }
            }

        }
        System.out.println("Max SubArray Sum :"+MaxSum);

    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        Maxsubarray(numbers);

    }
    

}
