import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DisconnectcomponentsBFS {
    static class  Edge{
        int src;
        int dest;
        int wgt;

        Edge(int src,int dest,int wgt){
          this.src=src;
          this.dest=dest;
          this.wgt=wgt;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]){
             for (int i = 0; i < graph.length; i++) {
              graph[i]=new ArrayList<>();  
             }

         graph[0].add(new Edge(0, 1, 1));
             graph[0].add(new Edge(0, 2, 1));
             graph[1].add(new Edge(1, 0, 1));
             graph[1].add(new Edge(1, 3, 1));
             graph[2].add(new Edge(2, 0, 1));
             graph[3].add(new Edge(3, 1, 1));
             graph[3].add(new Edge(3, 4, 1));
             graph[3].add(new Edge(3, 5, 1));
             graph[4].add(new Edge(4, 2, 1));
             graph[4].add(new Edge(4, 3, 1));
             graph[4].add(new Edge(4, 5, 1));
             graph[5].add(new Edge(5, 3, 1));
             graph[5].add(new Edge(5, 4, 1));
             graph[5].add(new Edge(5, 6, 1));
             graph[5].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge> graph[],int v,boolean visited[],int start){
       
        Queue <Integer> q=new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()) {
             int curr  =q.remove();
             if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
             }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V=7;

        ArrayList<Edge> graph[]=new ArrayList[V];
        creatGraph(graph);

       boolean vis[]=new boolean[V];
       for (int i = 0; i < V; i++) {
           if(vis[i]==false){
            bfs(graph, V, vis, i);
           }
       }
       System.out.println();
    }
}
