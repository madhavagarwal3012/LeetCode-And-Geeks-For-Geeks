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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        inorder = helper(root, inorder);

        int index = 0;
        while(index < inorder.size()){
            int tempIndex = index;
            int subIndex = inorder.size() - 1;
            while(subIndex > index){
                if(inorder.get(index) + inorder.get(subIndex) ==  k){
                    return true;
                }
                else if(inorder.get(index) + inorder.get(subIndex) >  k){
                    subIndex--;
                }
                else{
                    index++;
                }
            }
            index = tempIndex + 1;
        }
        return false;
    }
}