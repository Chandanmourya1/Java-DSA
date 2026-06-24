package Sorting;

public class SelectionSort {
    public static void selectionSort(int num[]){
        for(int i=0;i<num.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<num.length;j++){
                if(num[minPos]>num[j]){
                    minPos=j; 
                }
            }
            int temp=num[minPos];
            num[minPos]=num[i];
            num[i]=temp;
        }
    }
    public static void PrintNum(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[]args){
        int num[]={5,4,1,3,2};
        selectionSort(num);
        PrintNum(num);

    }
    
}
