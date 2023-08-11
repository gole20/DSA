// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int val) {
//         this.val = val;
//     }
// }

// public class BrothersBinaryTree {
//     private int depthX = -1;
//     private int depthY = -1;
//     private TreeNode parentX = null;
//     private TreeNode parentY = null;

//     public boolean isBrothers(TreeNode root, int x, int y) {
//         dfs(root, null, 0, x, y);
//         return depthX == depthY && parentX != parentY;
//     }

//     private void dfs(TreeNode node, TreeNode parent, int depth, int x, int y) {
//         if (node == null) {
//             return;
//         }

//         if (node.val == x) {
//             depthX = depth;
//             parentX = parent;
//         } else if (node.val == y) {
//             depthY = depth;
//             parentY = parent;
//         }

//         dfs(node.left, node, depth + 1, x, y);
//         dfs(node.right, node, depth + 1, x, y);
//     }

//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);

//         int x = 4, y = 3;
        
//         BrothersBinaryTree solution = new BrothersBinaryTree();
//         System.out.println(solution.isBrothers(root, x, y)); // Output: false
//     }
// }
// m