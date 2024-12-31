/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void nodesAtDistanceK(TreeNode root, int k, List<Integer> path){
        if(root == null || k < 0){
            return;
        }
        if(k == 0){
            path.add(root.val);
            return;
        }
        nodesAtDistanceK(root.left, k - 1, path);
        nodesAtDistanceK(root.right, k - 1, path);
    }
    public int distanceKHelper(TreeNode root, TreeNode target, int k, List<Integer> path){
        if(root == null || k < 0){
            return -1;
        }
        if(root == target){
            nodesAtDistanceK(root, k, path);
            return 0;
        }

        int dl = distanceKHelper(root.left, target, k, path);
        if(dl != -1){
            if(dl + 1 == k){
                path.add(root.val);
            }
            else{
                nodesAtDistanceK(root.right, k - dl - 2, path);
            }
            return 1 + dl;
        }
        int dr = distanceKHelper(root.right, target, k, path);
        if(dr != -1){
            if(dr + 1 == k){
                path.add(root.val);
            }
            else{
                nodesAtDistanceK(root.left, k - dr - 2, path);
            }
            return 1 + dr;
        }
        return -1;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> path = new ArrayList<>();
        distanceKHelper(root, target, k, path);
        return path;
    }
}