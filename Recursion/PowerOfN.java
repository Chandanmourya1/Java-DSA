public class PowerOfN {
    public static int Pow(int a,int n){
        if(n==0){
            return 1;
        }
        return a*Pow(a, n-1);
    }
    public static void main(String[]args){
        int a=2;
        int n=10;
        System.out.println(Pow(a, n));
        
    }
    
}
