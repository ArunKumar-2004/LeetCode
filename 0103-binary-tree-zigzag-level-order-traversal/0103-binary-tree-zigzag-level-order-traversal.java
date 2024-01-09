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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        ArrayList<List<Integer>> li=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int i=0;
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int c=q.size();
            while(c>0){
                TreeNode node=q.poll();
                list.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                c--;
            }
            if(i%2!=0){
                Collections.reverse(list);
                li.add(list);
            }else{
                li.add(list);
            }
            i++;
        }
        return li;
    }
}