/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isRight(TreeNode root,TreeNode node){
        if(root==null){
            return false;
        }
        if(root==node){
            return true;
        }
        return isRight(root.left,node) || isRight(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(isRight(root.left,p) && isRight(root.left,q)){
            return lowestCommonAncestor(root.left,p,q);
        }else if(isRight(root.right,p) && isRight(root.right,q)){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
    }
}