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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, 0, ans);
        return ans;
    }

    void helper(TreeNode root, int level, List<List<Integer>> ans){
        if (root == null) return;
        //add new array if not present
        if (level == ans.size()){
            ans.add(new ArrayList<>());
        }
        //add curr val
        ans.get(level).add(root.val);

        helper(root.left, level + 1 , ans);
        helper(root.right, level+1 , ans);

    }
    
}