package Array;

public class BinarySearch {
    public static int binarySearch(int numbers[],int key){
        int start =0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[]args){
        int numbers[]={10,12,30,25,20,40};
        int key=30;
        System.out.println("Numbers is At Index:" +binarySearch(numbers,key));

    }
    
}
