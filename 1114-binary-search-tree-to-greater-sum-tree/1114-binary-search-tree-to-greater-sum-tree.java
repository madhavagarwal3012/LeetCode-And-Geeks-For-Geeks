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
    public int bstToGstHelper(TreeNode root, int sum){
        if(root == null){
            return sum;
        }
        sum = bstToGstHelper(root.right, sum);
        sum += root.val;
        root.val = sum;
        sum = bstToGstHelper(root.left, sum);

        return sum;
    }
    public TreeNode bstToGst(TreeNode root) {
        if(root == null){
            return null;
        }
        bstToGstHelper(root, 0);
        return root;
    }
}