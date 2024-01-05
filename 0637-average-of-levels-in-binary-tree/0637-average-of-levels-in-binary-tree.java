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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> result = new ArrayList<>();
        if(root == null) return result;
        Level(root, result);
        return result;
    }
    
    public void Level(TreeNode root, List<Double> result){
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            int size = n;
            double sum = 0;
            
            while(n>0){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left != null) 
                    q.add(node.left);
                if(node.right != null) 
                    q.add(node.right);
                n--;
            }
            
            result.add(sum/size);
        }
    }
}