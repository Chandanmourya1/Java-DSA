package Array;

public class ReverseArray {
    public static void Reverse(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[]args){
        int numbers[]={20,30,40,50};
        Reverse(numbers);

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");

        }

        System.out.println();

    }
    
}
