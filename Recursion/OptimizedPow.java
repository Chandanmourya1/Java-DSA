public class OptimizedPow {
    public static int optimizedpow(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPow=optimizedpow(a, n/2);
        int halfPowsq=halfPow*halfPow;

        if(n%2!=0){
            return a*halfPowsq;

        }
        return halfPowsq;
    }
    public static void main(String[]args){
        int a=2;
        int n=10;
        System.out.println(optimizedpow(a, n));
    }
}
