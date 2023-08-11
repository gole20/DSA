// import java.util.*;

// public class MinimumStepsToCompleteTasks {
//     public int minimumSteps(int N, int[][] prerequisites) {
//         List<Integer>[] graph = new ArrayList[N + 1];
//         int[] indegree = new int[N + 1];
        
//         for (int i = 1; i <= N; i++) {
//             graph[i] = new ArrayList<>();
//         }
        
//         for (int[] pre : prerequisites) {
//             graph[pre[0]].add(pre[1]);
//             indegree[pre[1]]++;
//         }
        
//         Queue<Integer> queue = new LinkedList<>();
        
//         for (int i = 1; i <= N; i++) {
//             if (indegree[i] == 0) {
//                 queue.add(i);
//             }
//         }
        
//         int steps = 0;
        
//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             for (int i = 0; i < size; i++) {
//                 int curr = queue.poll();
//                 N--;
//                 for (int next : graph[curr]) {
//                     indegree[next]--;
//                     if (indegree[next] == 0) {
//                         queue.add(next);
//                     }
//                 }
//             }
//             steps++;
//         }
        
//         return N == 0 ? steps : -1;
//     }

//     public static void main(String[] args) {
//         int N = 3;
//         int[][] prerequisites = {{1, 3}, {2, 3}};
        
//         MinimumStepsToCompleteTasks solution = new MinimumStepsToCompleteTasks();
//         System.out.println(solution.minimumSteps(N, prerequisites)); // Output: 2
//     }
// }
