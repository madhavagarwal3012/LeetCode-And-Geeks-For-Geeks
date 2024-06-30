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
    public List<Integer> kthHelper(TreeNode root, List<Integer>inorder){
        if(root == null){
            return null;
        }
        kthHelper(root.left, inorder);
        inorder.add(root.val);
        kthHelper(root.right, inorder);

        return inorder;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>inorder = new ArrayList<>();
        inorder = kthHelper(root, inorder);

        return inorder.get(k-1);
    }
}