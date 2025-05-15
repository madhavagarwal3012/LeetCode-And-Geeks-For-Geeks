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
    public void sumNumbersHelper(TreeNode root, ArrayList<String> numberList, StringBuilder number){
        if(root == null){
            return;
        }
        number.append(String.valueOf(root.val));
        if (root.left == null && root.right == null) {
            numberList.add(number.toString());
        }
        else {
            sumNumbersHelper(root.left, numberList, number);
            sumNumbersHelper(root.right, numberList, number);
        }
        number.deleteCharAt(number.length() - 1);
    }
    public int sumNumbers(TreeNode root) {
        ArrayList<String> numberList = new ArrayList<>();
        StringBuilder number = new StringBuilder("");
        sumNumbersHelper(root, numberList, number);

        int sum = 0;
        for(int index = 0; index < numberList.size(); index++){
            System.out.println(numberList.get(index));
            sum = sum += Integer.parseInt(numberList.get(index));
        }
        return sum;
    }
}