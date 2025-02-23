/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        HashMap<Integer,Integer> pre = new HashMap<>();
        HashMap<Integer,Integer> pos = new HashMap<>();
        Queue<TreeNode> qu = new LinkedList<>();
        int n = preorder.length;

        // Store the index positions of elements in preorder and postorder
        for(int i = 0; i < n; i++) {
            pre.put(preorder[i], i);
            pos.put(postorder[i], i);
        }

        // Start building the tree with the first node in preorder
        TreeNode root = new TreeNode(preorder[0]);
        qu.add(root);

        while (!qu.isEmpty()) {
            TreeNode t = qu.poll(); // Process current node
            int l = pre.get(t.val) + 1;  // Index of left child in preorder
            int r = pos.get(t.val) - 1;  // Index of right child in postorder

            // Process left child if it's valid
            if (l < n && preorder[l] != -1) {
                t.left = new TreeNode(preorder[l]);
                qu.add(t.left);
                postorder[pos.get(preorder[l])] = -1;  // Mark as visited
                preorder[l] = -1;
            }

            // Process right child if it's valid
            if (r >= 0 && postorder[r] != -1) {
                t.right = new TreeNode(postorder[r]);
                qu.add(t.right);
                preorder[pre.get(postorder[r])] = -1;  // Mark as visited
                postorder[r] = -1;
            }
        }

        return root;
    }
}