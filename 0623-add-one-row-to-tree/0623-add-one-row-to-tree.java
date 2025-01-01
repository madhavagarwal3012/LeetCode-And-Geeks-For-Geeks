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
    public void helper(TreeNode root, int val, int depth){
        if(root == null){
            return;
        }
        if(depth == 0){
            TreeNode leftNode = new TreeNode(val);
            TreeNode rightNode = new TreeNode(val);

            leftNode.left = root.left;
            rightNode.right = root.right;

            root.left = leftNode;
            root.right = rightNode;

            return;
        }
        helper(root.left, val, depth - 1);
        helper(root.right, val, depth - 1);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root == null){
            return null;
        }
        if(depth == 1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        helper(root, val, depth - 2);
        return root;
    }
}