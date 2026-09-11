package GRAPHPART1;

import java.util.ArrayList;

public class HasPath {
        static class Edges {
        int src;
        int dest;
        int wt;

        public Edges(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<Edges> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new Edges(0, 1, 1));
        graph[0].add(new Edges(0, 2, 1));

        graph[1].add(new Edges(1, 0, 1));
        graph[1].add(new Edges(1, 3, 1));

        graph[2].add(new Edges(2, 0, 1));
        graph[2].add(new Edges(2, 4, 1));

        graph[3].add(new Edges(3, 1, 1));
        graph[3].add(new Edges(3, 4, 1));
        graph[3].add(new Edges(3, 5, 1));

        graph[4].add(new Edges(4, 2, 1));
        graph[4].add(new Edges(4, 3, 1));
        graph[4].add(new Edges(4, 5, 1));

        graph[5].add(new Edges(5, 3, 1));
        graph[5].add(new Edges(5, 4, 1));
        graph[5].add(new Edges(5, 6, 1));

        graph[6].add(new Edges(6, 5, 1));


    }
    public static void main(String [] args){
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edges>[] graph = (ArrayList<Edges>[]) new ArrayList[V];

        createGraph(graph);
    }
    
}
