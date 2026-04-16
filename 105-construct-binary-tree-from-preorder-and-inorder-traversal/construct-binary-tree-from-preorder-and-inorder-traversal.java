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
    private Map<Integer, Integer> in;
    private int pre;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        in = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            in.put(inorder[i], i);
        }
        pre = 0;
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        if (left > right) return null;
        int rootVal = preorder[pre++];
        TreeNode root = new TreeNode(rootVal);
        int rootInIndex = in.get(rootVal);
        root.left = build(preorder, left, rootInIndex - 1);
        root.right = build(preorder, rootInIndex + 1, right);

        return root;
    }
}
