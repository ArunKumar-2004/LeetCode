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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int count=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            int c=q.size();
            while(c>0){
                TreeNode node=q.poll();
                if(node.left!=null){
                    q.add(node.left);
                }if(node.right!=null){
                    q.add(node.right);
                }
                c--;
            }
            count++;
        }
        return count;
    }
}