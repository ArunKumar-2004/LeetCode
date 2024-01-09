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
    private Map<Integer, Integer> map = new HashMap<>();
    private int maxFrequency = 0;

    public void Helper(TreeNode root) {
        if (root==null) {
            return;
        }
        Helper(root.left);
        int count=map.getOrDefault(root.val, 0) + 1;
        map.put(root.val, count);
        maxFrequency=Math.max(maxFrequency, count);
        Helper(root.right);
    }
    public int[] findMode(TreeNode root) {
        Helper(root);
        List<Integer> modes=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if (entry.getValue()==maxFrequency) {
                modes.add(entry.getKey());
            }
        }
        int[] result=new int[modes.size()];
        for (int i=0;i<modes.size();i++) {
            result[i]=modes.get(i);
        }
        return result;
    }
}