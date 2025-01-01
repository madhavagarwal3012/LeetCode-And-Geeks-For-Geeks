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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrderList = new ArrayList<>();
        
        if (root == null) {
            return levelOrderList;
        }
        
        List<Integer> level = new ArrayList<>();
        level.add(root.val);
        levelOrderList.add(level);
        
        Queue<TreeNode> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);
        
        while (!pendingChildren.isEmpty()) {
            int levelSize = pendingChildren.size();
            level = new ArrayList<>();
            
            while (levelSize > 0) {
                TreeNode front = pendingChildren.poll();
                
                if (front.left != null) {
                    level.add(front.left.val);
                    pendingChildren.add(front.left);
                }
                if (front.right != null) {
                    level.add(front.right.val);
                    pendingChildren.add(front.right);
                }
                levelSize--;
            }
            if (!level.isEmpty()) {
                levelOrderList.add(level);
            }
        }
        for(int startingIndex = 0, endingIndex = levelOrderList.size() - 1; startingIndex < endingIndex; startingIndex++, endingIndex--){
            List<Integer> temp = levelOrderList.get(startingIndex);
            levelOrderList.set(startingIndex, levelOrderList.get(endingIndex));
            levelOrderList.set(endingIndex, temp);
        }
        return levelOrderList;
    }
}