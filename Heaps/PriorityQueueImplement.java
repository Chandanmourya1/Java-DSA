package Heaps;
import java.util.PriorityQueue;
public class PriorityQueueImplement {
    public static void main(String[] args){
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        pq.add(4); //O(log n)
        pq.add(5);
        pq.add(3);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());//O(1)
            pq.remove(); // O(log n)
        }
    }
    
}
