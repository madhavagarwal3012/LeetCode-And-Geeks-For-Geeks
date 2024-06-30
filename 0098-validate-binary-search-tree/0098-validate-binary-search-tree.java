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
    public List<Integer> helper(TreeNode root, List<Integer> inorder){
        if(root == null){
            return null;
        }
        helper(root.left,inorder);
        inorder.add(root.val);
        helper(root.right,inorder);

        return inorder;
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        List<Integer>inorder = new ArrayList<>();
        inorder = helper(root,inorder);

        int previous = inorder.get(0);

        for(int index = 1; index<inorder.size(); index++){
            if(inorder.get(index) <= previous){
                return false;
            }
            previous = inorder.get(index);
        }
        return true;
    }
}