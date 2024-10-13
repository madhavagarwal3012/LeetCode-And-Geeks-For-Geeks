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
    public ArrayList<TreeNode> helper(TreeNode root, ArrayList<TreeNode> list){
        if(root == null){
            return list;
        }
        list.add(root);
        helper(root.left, list);
        helper(root.right, list);
        return list;
    }
    public void flatten(TreeNode root) {
       ArrayList<TreeNode> list = new ArrayList<>();
       list = helper(root, list);
       for(int index = 1; index < list.size(); index++){
        list.get(index - 1).left = null;
        list.get(index - 1).right = list.get(index);
       }
    }
}