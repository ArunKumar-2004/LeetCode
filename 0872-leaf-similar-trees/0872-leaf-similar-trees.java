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
    public ArrayList<Integer> Leaf(TreeNode root,ArrayList<Integer> li){
        if(root==null){
            return li;
        }
        if(root.left==null && root.right==null){
            li.add(root.val);
            return li;
        }
        Leaf(root.left,li);
        Leaf(root.right,li);
        return li;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> li1=Leaf(root1,new ArrayList<Integer>());
        ArrayList<Integer> li2=Leaf(root2,new ArrayList<Integer>());
        System.out.print(li1+" "+li2);
        if(li1.size()!=li2.size()){
            return false;
        }
        for(int i=0;i<li1.size();i++){
            if(li1.get(i)!=li2.get(i)){
                return false;
            }
        }
        return true;
    }
}