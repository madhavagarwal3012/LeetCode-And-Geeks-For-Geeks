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
    public TreeNode helper(int [] nums, int leftsubtreeIndex, int rightsubtreeIndex){
        if(leftsubtreeIndex > rightsubtreeIndex){
            return null;
        }
        int mid = (leftsubtreeIndex + rightsubtreeIndex) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, leftsubtreeIndex, mid - 1);
        root.right = helper(nums, mid + 1, rightsubtreeIndex);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
}