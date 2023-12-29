import java.util.ArrayList;
import java.util.List;

public class DFSListGraph {
    static List<List<Integer>> adjList;
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] inputArr = {{0,1},{0,2},{1,3},{2,3},{2,4}};
        int node_n = 5;
        visited = new boolean[node_n];
        adjList = new ArrayList<>();
        for(int i =0 ; i< node_n ; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : inputArr){
            addEdge(a[0],a[1]);
        }

        dfs(3);

    }
    static void dfs(int start){
        visited[start] = true;
        System.out.print( start + " ");
        for(int target  : adjList.get(start)){
            if(!visited[target]){
                dfs(target);
            }

        }
    }

    static void addEdge(int a, int b){
        adjList.get(a).add(b);
        adjList.get(b).add(a);
    }
}
