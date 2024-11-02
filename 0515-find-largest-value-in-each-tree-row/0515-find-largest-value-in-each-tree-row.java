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
    public List<Integer> largestValues(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);

        while(!pendingChildren.isEmpty()){
            int levelSize = pendingChildren.size();
            int maximumValue = Integer.MIN_VALUE;

            for(int levelCount = 0; levelCount < levelSize; levelCount++){
                TreeNode node = pendingChildren.poll();
                if(node != null && node.val > maximumValue){
                    maximumValue = node.val;
                }
                if(node != null && node.left != null){
                    pendingChildren.add(node.left);
                }
                if(node != null && node.right != null){
                    pendingChildren.add(node.right);
                }
            }
            list.add(maximumValue);
        }
        return list;
    }
}