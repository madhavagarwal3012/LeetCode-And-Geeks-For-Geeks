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
    public void inorderHelper(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        if(root.left != null){
            inorderHelper(root.left,list);
        }
        list.add(root.val);
        if(root.right != null){
            inorderHelper(root.right,list);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderHelper(root,list);
        return list;
    }
}