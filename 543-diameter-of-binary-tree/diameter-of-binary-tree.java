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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        Height(root);
        return max;
    }
    public int Height(TreeNode node){
        if(node==null){
            return 0;
        }
        int l=Height(node.left);
        int  r = Height(node.right);
        max=Math.max(max,l+r);
        return Math.max(l,r)+1;
    }
}