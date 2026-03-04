/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { this.val = val; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Base case: if the node is null, return null
        if (root == null) {
            return null;
        }

        // Recursively call for left and right children
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // Swap the children
        root.left = right;
        root.right = left;

        return root;
    }
}
