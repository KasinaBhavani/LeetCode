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
import java.util.*;
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> p = new ArrayList<>();
        if (root != null) {
            dfs(root, "", p);
        }
        return p;
    }

    private void dfs(TreeNode node, String path, List<String> p) {
        path += node.val;
        if (node.left == null && node.right == null) {
            p.add(path);
            return;
        }
        if (node.left != null) {
            dfs(node.left, path + "->", p);
        }
        if (node.right != null) {
            dfs(node.right, path + "->", p);
        }
    }
}
