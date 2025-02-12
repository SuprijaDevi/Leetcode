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
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postTraversal(root);
        return result;
    }
    public void postTraversal(TreeNode root) {
        if(root == null) {
        return;
        }
        postTraversal(root.left);
        postTraversal(root.right);
        result.add(root.val);
    }
        
}