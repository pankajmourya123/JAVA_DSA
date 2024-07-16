import java.util.ArrayList;
import java.util.HashMap;

public class ImplementaionHashmap {
    static class Edge{
        int src;
        int dest;
        int wgt;

        Edge(int src, int dest, int wgt) {
            this.src = src;
            this.dest = dest;
            this.wgt = wgt;
        }
    }

    
public static void createGraph(HashMap<Integer,ArrayList<Edge>> graph){
    for (int i = 0; i < graph.size(); i++) {
        graph.put(i, new ArrayList<>());
    }
    graph.get(0).add(new Edge(0,1,1));
    graph.get(0).add(new Edge(0, 2, 1));
    graph.get(1).add(new Edge(1, 0, 1));
    graph.get(1).add(new Edge(1, 3, 1));
    graph.get(2).add(new Edge(2, 0, 1));
    graph.get(3).add(new Edge(3, 1, 1));
    graph.get(3).add(new Edge(3, 4, 1));
    graph.get(3).add(new Edge(3, 5, 1));
    graph.get(4).add(new Edge(4, 2, 1));
    graph.get(4).add(new Edge(4, 3, 1));
    graph.get(4).add(new Edge(4, 5, 1));
    graph.get(5).add(new Edge(5, 3, 1));
    graph.get(5).add(new Edge(5, 4, 1));
    graph.get(5).add(new Edge(5, 6, 1));
    graph.get(6).add(new Edge(6, 5, 1));

}
    public static void main(String[] args) {
        int V=4;
        HashMap<Integer,ArrayList<Edge>> graph=new HashMap<>();
        createGraph(graph);
    }
}
