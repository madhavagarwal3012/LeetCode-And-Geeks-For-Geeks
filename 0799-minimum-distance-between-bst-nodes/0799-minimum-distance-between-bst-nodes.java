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
    public List<Integer> helper(TreeNode root, List<Integer>inorder){
        if(root == null){
            return null;
        }
        helper(root.left, inorder);
        inorder.add(root.val);
        helper(root.right, inorder);

        return inorder;
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer>inorder = new ArrayList<>();
        inorder = helper(root, inorder);
        int smallest = Integer.MAX_VALUE;

        for(int index = inorder.size()-1; index > 0; index--){
            if(inorder.get(index) - inorder.get(index - 1) < smallest){
                smallest = inorder.get(index) - inorder.get(index - 1);
            }
        }
        return smallest;
    }
}