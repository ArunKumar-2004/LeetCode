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
    int max=0,curr=0;
    public void Helper(TreeNode root,int curr){
        if(root==null){
            return;
        }
        int n=Abs(curr,root.val);
        if(max<n){
            max=n;
        }
        Helper(root.left,curr);
        Helper(root.right,curr);
    }
    public int Abs(int a,int b){
        return (a>b)?a-b:b-a;
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return 0;
        }
        curr=root.val;
        Helper(root,curr);
        maxAncestorDiff(root.left);
        maxAncestorDiff(root.right);
        return max;
    }
}