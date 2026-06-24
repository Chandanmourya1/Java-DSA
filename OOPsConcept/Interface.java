package OOPsConcept;
public class Interface {
    public static void main(String []args){
        Queen q =new Queen();
        q.moves();
        Rook rk =new Rook();
        rk.moves();
        King k = new King();
        k.moves();
    }
    
}
interface ChessPlayer{
    void moves();

}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,rigth,diagonal (in all direction");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}