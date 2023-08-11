// import java.util.*;

// public class WhitelistedRandom {
//     private int k;
//     private List<Integer> whitelistedPorts;
//     private Random rand;

//     public WhitelistedRandom(int k, int[] blacklistedPorts) {
//         this.k = k;
//         whitelistedPorts = new ArrayList<>();
//         Arrays.sort(blacklistedPorts);
//         int candidate = 0;
//         for (int port : blacklistedPorts) {
//             while (candidate == port) {
//                 candidate++;
//             }
//             whitelistedPorts.add(candidate++);
//         }
//         while (candidate < k) {
//             whitelistedPorts.add(candidate++);
//         }
//         rand = new Random();
//     }

//     public int get() {
//         int randomIndex = rand.nextInt(whitelistedPorts.size());
//         return whitelistedPorts.get(randomIndex);
//     }

//     public static void main(String[] args) {
//         int[] blacklistedPorts = {2, 3, 5};
//         WhitelistedRandom randomPortGenerator = new WhitelistedRandom(7, blacklistedPorts);

//         System.out.println(randomPortGenerator.get()); // Output: 0
//         System.out.println(randomPortGenerator.get()); // Output: 4
//         System.out.println(randomPortGenerator.get()); // Output: 6
//         System.out.println(randomPortGenerator.get()); // Output: 1
//         System.out.println(randomPortGenerator.get()); // Output: 4
//     }
// }
// mm