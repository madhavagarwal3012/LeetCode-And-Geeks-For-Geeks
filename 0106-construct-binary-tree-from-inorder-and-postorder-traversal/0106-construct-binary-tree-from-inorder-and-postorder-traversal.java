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
    public TreeNode buildTreeHelper(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd){
        if(inStart > inEnd || postStart > postEnd){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int rootIndex = -1;
        for(int index = inStart; index <= inEnd; index++){
            if(root.val == inorder[index]){
                rootIndex = index;
                break;
            }
        }
        int inStartLeft = inStart;
        int inEndLeft = rootIndex - 1;
        int inStartRight = rootIndex + 1;
        int inEndRight = inEnd;

        int postStartLeft = postStart;
        int postEndLeft = postStartLeft + (inEndLeft - inStartLeft);
        int postStartRight = postEndLeft + 1;
        int postEndRight = postEnd - 1;

        root.left = buildTreeHelper(inorder, postorder, inStartLeft, inEndLeft, postStartLeft, postEndLeft);
        root.right = buildTreeHelper(inorder, postorder, inStartRight, inEndRight, postStartRight, postEndRight);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }
}