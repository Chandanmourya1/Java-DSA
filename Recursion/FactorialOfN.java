public class FactorialOfN {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int factorial=n*fnm1;
        return factorial;
    }
    public static void main(String[]args){
        int n=10;
        System.out.println(fact(n));
    }
}
