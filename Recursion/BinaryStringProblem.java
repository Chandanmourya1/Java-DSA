public class BinaryStringProblem {
    public static void binaryString(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastPlace==0){
             binaryString(n-1, 0, str+"0");
             binaryString(n-1, 1, str+"1");
        }
        else{
            binaryString(n-1, 0, str+"0");
        }
        
    }
    public static void main(String[] args){
        binaryString(3, 0, " ");

    }
    
}
