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
    public void Helper(TreeNode root,long targetSum, long[] count){
        if(root==null){
            return;
        }
        if(root.val==targetSum){
            count[0]++;
        }
        Helper(root.left,targetSum-root.val,count);
        Helper(root.right,targetSum-root.val,count);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        long count[]={0};
        Helper(root,targetSum,count);
        count[0] +=pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
        return (int)count[0];
    }
}