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
class  Pair {
	int diameter;
	int height;

	public Pair(int diameter, int height){
		this.diameter = diameter;
		this.height = height;
	}
}
class Solution {
    public Pair helper(TreeNode root){
        if(root == null){
			return new Pair(0 , 0); 
		}
		if(root.left == null && root.right == null){
			return new Pair(0, 1);
		}
		Pair leftOutput = helper(root.left);
		Pair rightOutput = helper(root.right);
		int height = 1 + Math.max(leftOutput.height, rightOutput.height);
		int diameter = Math.max((leftOutput.height + rightOutput.height),Math.max (leftOutput.diameter, rightOutput.diameter));
		
		return new Pair(diameter, height);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        return helper(root).diameter;
    }
}