import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSListGraph {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static  int[] distance;

    public static void main(String[] args) {


        int[][] inputArr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
        int node_n = 5;
        visited = new boolean[node_n];
        adjList = new ArrayList<>();
        for (int i = 0; i < node_n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] a : inputArr) {
            addEdge(a[0], a[1]);
        }
//        for(int i =1; i<=3 ; i++){ //3 == (행의 개수)
//            for (int j = 1; j <= 5 ; j++) { // 5== (열의 개수)
////                1)시작 노드 표현식 : (i-1)*5(열의 개수) +j
////                2)타겟의 번호와 타겟의 유효성(2)
////                2-1) 타겟의 번호 :좌우 이동 =j , 상하 이동 =i
////                2-2) 타겟의 유효성 : i와 j가 상하 좌우 길이 체크
////                상하 좌우 체크 로직
//                int[] dx = {-1, 1, 0, 0,};
//                int[] dy = {0, 0, -1, 1};
//                for (int d = 0; d < 4; d++) {
//                    int target_i = i + dx[d];
//                    int target_j = j + dy[d];
//                    if (target_i >= 1 && target_i <= 3 && target_j >= 1 && target_j <= 5) {
//                        addEdge((i - 1) * 5 + j, (target_i - 1) * 5 + j);
//                    }
//                }
//            }
//        }

        distance = new int[node_n];
        int shortest = bfs(0, 4);
        System.out.println(shortest);
    }

    static int bfs(int start, int end){
        Queue<Integer> queue  = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while(!queue.isEmpty()){
            int next = queue.poll(); // 방문
            System.out.print(next+ " ");
            for(int target : adjList.get(next)){
                if(!visited[target]){
                    distance[target] = distance[next]+1;
                    queue.add(target); // 방문예정인 데이터를 큐에 담는 것
                    visited[target] = true;
                    if(target == end){
                        System.out.println(target);
                        return distance[end];
                    }
                }
            }
        }
        return -1;
    }
    static void addEdge(int a, int b){
        adjList.get(a).add(b);
        adjList.get(b).add(a);
    }

}


//프로그래머스 가장 먼 노드
