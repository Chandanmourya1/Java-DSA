public class Inverted_Pyramid {
    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
public static void Inverted_Pyramid_withNumber(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[]args){
        Inverted_Pyramid_withNumber(4);
    }
    
}
