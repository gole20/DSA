// public class MaximumPointsFromShootingTargets {
//     public static int maxPoints(int[] a) {
//         int n = a.length;
//         int[][] dp = new int[n][n];
        
//         for (int len = 1; len <= n; len++) {
//             for (int i = 0; i <= n - len; i++) {
//                 int j = i + len - 1;
//                 for (int k = i; k <= j; k++) {
//                     int leftVal = (i == 0) ? 1 : a[i - 1];
//                     int rightVal = (j == n - 1) ? 1 : a[j + 1];
                    
//                     int leftPoints = (k == i) ? 0 : dp[i][k - 1];
//                     int rightPoints = (k == j) ? 0 : dp[k + 1][j];
                    
//                     dp[i][j] = Math.max(dp[i][j], leftPoints + leftVal * a[k] * rightVal + rightPoints);
//                 }
//             }
//         }
        
//         return dp[0][n - 1];
//     }

//     public static void main(String[] args) {
//         int[] a = {3, 1, 5, 8};
//         System.out.println(maxPoints(a)); // Output: 167
//     }
// }
