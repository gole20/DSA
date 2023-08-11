// public class MinimumCostClothing {
//           public static int minCost(int[][] price) {
//               int n = price.length;
      
//               // Initialize the minimum cost for the first person
//               int[] dp = price[0];
      
//               for (int i = 1; i < n; i++) {
//                   int[] newDp = new int[3];
      
//                   // Calculate the minimum cost for the current person based on the previous person's choices
//                   newDp[0] = price[i][0] + Math.min(dp[1], dp[2]);
//                   newDp[1] = price[i][1] + Math.min(dp[0], dp[2]);
//                   newDp[2] = price[i][2] + Math.min(dp[0], dp[1]);
      
//                   dp = newDp;
//               }
      
//               // Return the minimum cost for the last person's choices
//               return Math.min(Math.min(dp[0], dp[1]), dp[2]);
//           }
      
//           public static void main(String[] args) {
//               int[][] price = {{14, 4, 11}, {11, 14, 3}, {14, 2, 10}};
//               System.out.println(minCost(price)); // Output: 9
//           }
//       }
      