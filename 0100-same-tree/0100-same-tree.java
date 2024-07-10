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
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        if((root1 != null && root2 == null) || (root2 != null && root1 == null)){
			return false;
		}
		Queue<TreeNode> queue1 = new LinkedList<>();
		Queue<TreeNode> queue2 = new LinkedList<>();
		queue1.add(root1);
		queue2.add(root2);

		while(!queue1.isEmpty() && !queue2.isEmpty()){
			int levelSize1 = queue1.size();
			int levelSize2 = queue2.size();

			if(levelSize1 != levelSize2){
				return false;
			}
			for(int level = 0; level < levelSize1; level++){
				TreeNode front1 = queue1.poll();
				TreeNode front2 = queue2.poll();
                if(front1 == null && front2 == null){
                    return true;
                }
				else if(front1 != null && front2 != null){
                    if(front1.val != front2.val){
					    return false;
				    }
                }
                else if(front1 == null || front2 == null){
                    return false;
                }
				if(front1.left != null && front2.left != null){
                    queue1.add(front1.left);
                    queue2.add(front2.left);
                }
                else if(front1.left != null && front2.left == null){
                    return false;
                }
                else if(front1.left == null && front2.left != null){
                    return false;
                }
                if(front1.right != null && front2.right != null){
                    queue1.add(front1.right);
                    queue2.add(front2.right);
                }
                else if(front1.right != null && front2.right == null){
                    return false;
                }
                else if(front1.right == null && front2.right != null){
                    return false;
                }
			}
		}
		return queue1.isEmpty() && queue2.isEmpty();
    }
}