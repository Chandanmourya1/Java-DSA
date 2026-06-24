package TwoDArray;
import java.util.*;
public class TwoDArray {
    public static boolean Search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("Found at:("+i+","+j+")");
                    return true;
                }
                
            }
        }
        System.out.print("Not Found");
        return false;

        
    }
    public static void main(String[]args){
        int matrix[][]=new int[3][3];
        //for taking input.
        Scanner sc=new Scanner(System.in);
        int n=matrix.length;
        int m=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        //for output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
      

        Search(matrix,2 );
    }
    
    
}
