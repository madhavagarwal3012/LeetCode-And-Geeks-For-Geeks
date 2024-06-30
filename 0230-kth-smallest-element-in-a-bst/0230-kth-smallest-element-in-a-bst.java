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
    public List<Integer> kthHelper(TreeNode root, List<Integer>inorder,int k){
        if(inorder.size() == k){
            return inorder;
        }
        if(root == null){
            return null;
        }
        kthHelper(root.left, inorder,k);
        inorder.add(root.val);
        kthHelper(root.right, inorder,k);

        return inorder;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>inorder = new ArrayList<>();
        inorder = kthHelper(root, inorder, k);
        return inorder.get(k-1);
    }
}