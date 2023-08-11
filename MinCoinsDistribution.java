// public class MinCoinsDistribution {
//     public static int minCoins(int[] ratings) {
//         int n = ratings.length;
//         int[] coins = new int[n];
        
//         // Initialize each rider with 1 coin
//         Arrays.fill(coins, 1);
        
//         // Traverse from left to right
//         for (int i = 1; i < n; i++) {
//             if (ratings[i] > ratings[i - 1]) {
//                 coins[i] = coins[i - 1] + 1;
//             }
//         }
        
//         // Traverse from right to left
//         for (int i = n - 2; i >= 0; i--) {
//             if (ratings[i] > ratings[i + 1]) {
//                 coins[i] = Math.max(coins[i], coins[i + 1] + 1);
//             }
//         }
        
//         // Sum up the coins to get the minimum total
//         int totalCoins = 0;
//         for (int coin : coins) {
//             totalCoins += coin;
//         }
        
//         return totalCoins;
//     }

//     public static void main(String[] args) {
//         int[] ratings = {1, 0, 2};
//         System.out.println(minCoins(ratings)); // Output: 5
//     }
// }
