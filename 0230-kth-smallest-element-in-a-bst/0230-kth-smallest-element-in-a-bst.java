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
    private int count;
    private int result;
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        result=0;
        Helper(root,k);
        return result;
    }
    public void Helper(TreeNode root,int k){
        if(root==null || count>=k){
            return;
        }
        Helper(root.left,k);
        count++;
        if(count==k){
            result=root.val;
            return;
        }
        Helper(root.right,k);
    }
}