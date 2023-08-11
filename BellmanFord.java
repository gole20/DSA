// import java.util.Arrays;

// class BellmanFord {
//     static class Edge {
//         int source, destination, weight;
//         Edge(int source, int destination, int weight) {
//             this.source = source;
//             this.destination = destination;
//             this.weight = weight;
//         }
//     }

//     static int[] bellmanFord(int vertices, int edges, Edge[] graph, int source) {
//         int[] distances = new int[vertices];
//         Arrays.fill(distances, Integer.MAX_VALUE);
//         distances[source] = 0;

//         for (int i = 1; i < vertices; i++) {
//             for (Edge edge : graph) {
//                 if (distances[edge.source] != Integer.MAX_VALUE && distances[edge.source] + edge.weight < distances[edge.destination]) {
//                     distances[edge.destination] = distances[edge.source] + edge.weight;
//                 }
//             }
//         }

//         return distances;
//     }

//     public static void main(String[] args) {
//         int vertices = 5;
//         int edges = 8;
//         Edge[] graph = new Edge[]{
//                 new Edge(0, 1, -1), new Edge(0, 2, 4),
//                 new Edge(1, 2, 3), new Edge(1, 3, 2),
//                 new Edge(1, 4, 2), new Edge(3, 2, 5),
//                 new Edge(3, 1, 1), new Edge(4, 3, -3)
//         };
//         int source = 0;

//         int[] distances = bellmanFord(vertices, edges, graph, source);

//         System.out.println("Vertex    Distance from Source");
//         for (int i = 0; i < vertices; i++) {
//             System.out.println(i + "\t\t" + distances[i]);
//         }
//     }
// }
