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
    public void helper(TreeNode root, ArrayList<Integer> list, HashMap<Integer, Integer> map){
        if(root == null){
            return;
        }
        helper(root.left, list, map);
        if(!map.containsKey(root.val)){
            map.put(root.val, 1);
            list.add(root.val);
        }
        else{
            map.put(root.val, map.get(root.val) + 1);
        }
        helper(root.right, list, map);
    }
    public int[] findMode(TreeNode root) {
        if(root.left == null && root.right == null){
            int array [] = new int[1];
            array[0] = root.val;
            return array;
        }
        ArrayList<Integer> modeList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        helper(root, list, map);
        int mode = Integer.MIN_VALUE;
        for(int index = 0; index < list.size(); index++){
            if(map.get(list.get(index)) > mode){
                mode = map.get(list.get(index));
            }
        }
        for(int index = 0; index < list.size(); index++){
            if(map.get(list.get(index)) == mode){
                modeList.add(list.get(index));
            }
        }
        int array [] = new int[modeList.size()];
        for(int index = 0; index < modeList.size(); index++){
            array[index] = modeList.get(index);
        }
        return array;
    }
}