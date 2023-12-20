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
     HashMap<Integer, Integer> Map = new HashMap();
     int PreIndex = 0;
    public TreeNode buildTree(int[] Pre, int[] In) {
        for (int i = 0 ; i < In.length; i++){
            Map.put(In[i], i);
        }
        return CreateTree(Pre, 0, In.length - 1);
    }

    public TreeNode CreateTree(int[] Pre, int InLeft, int InRight) {
        if (InLeft > InRight){
            return null;
        }
        TreeNode root = new TreeNode(Pre[PreIndex++]);
        int InMid= Map.get(root.val);
        root.left =  CreateTree(Pre, InLeft, InMid- 1);
        root.right = CreateTree(Pre, InMid+ 1, InRight);
        return root;
    }
}