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
    public TreeNode helper(int[] preorder, int[] postorder, int preStart, int preEnd, int postStart, int postEnd){
        if(preStart > preEnd || postStart > postEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        if(preStart == preEnd){
            return root;
        }
        int leftValue = preorder[preStart + 1];
        int leftPos = -1;
        for(int index = postStart; index <= postEnd; index++){
            if(postorder[index] == leftValue){
                leftPos = index;
                break;
            }
        }
        int leftSize = leftPos - postStart + 1;

        int preStartLeft = preStart + 1;
        int preEndLeft = preStart + leftSize;
        int postStartLeft = postStart;
        int postEndLeft = leftPos;
        int preStartRight = preEndLeft + 1;
        int preEndRight = preEnd;
        int postStartRight = postEndLeft + 1;
        int postEndRight = postEnd - 1;

        root.left = helper(preorder, postorder, preStartLeft, preEndLeft, postStartLeft, postEndLeft);
        root.right = helper(preorder, postorder, preStartRight, preEndRight, postStartRight, postEndRight);
        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if(preorder.length == 0 || postorder.length == 0){
            return null;
        }
        else if(preorder.length != postorder.length){
            return null;
        }
        else{
            return helper(preorder, postorder, 0, preorder.length - 1, 0, postorder.length - 1);
        }
    }
}