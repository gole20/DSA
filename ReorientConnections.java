// import java.util.*;

// public class ReorientConnections {
//     public int minReorder(int n, int[][] connections) {
//         List<Integer>[] graph = new ArrayList[n];
//         for (int i = 0; i < n; i++) {
//             graph[i] = new ArrayList<>();
//         }
        
//         for (int[] connection : connections) {
//             graph[connection[0]].add(connection[1]); // Create directed edges
//             graph[connection[1]].add(-connection[0]); // Mark edges that need to be reversed
//         }
        
//         Set<Integer> reachableFromZero = new HashSet<>();
//         dfs(graph, reachableFromZero, 0);
        
//         int changes = 0;
//         for (int[] connection : connections) {
//             if (reachableFromZero.contains(connection[1])) {
//                 changes++;
//             }
//         }
        
//         return changes;
//     }
    
//     private void dfs(List<Integer>[] graph, Set<Integer> reachable, int node) {
//         if (node < 0) {
//             node = -node; // Convert back to positive index
//         }
//         reachable.add(node);
//         for (int neighbor : graph[node]) {
//             if (!reachable.contains(neighbor)) {
//                 dfs(graph, reachable, neighbor);
//             }
//         }
//     }

// 

//     public static void main(String[] args) {
//         int n = 6;
//         int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        
//         ReorientConnections solution = new ReorientConnections();
//         System.out.println(solution.minReorder(n, connections)); // Output: 3
//     }
// }
// mrinal lama 