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
    public int Helper(TreeNode root, int mx, int mn) {
        if (root == null) {
            return mx - mn;
        }
        mx = Math.max(root.val, mx);
        mn = Math.min(root.val, mn);
        int leftTree = Helper(root.left, mx, mn);
        int rightTree = Helper(root.right, mx, mn);
        return Math.max(leftTree, rightTree);
    }
    public int maxAncestorDiff(TreeNode root) {
        int n = Helper(root, root.val, root.val);
        return n;
    }
}
