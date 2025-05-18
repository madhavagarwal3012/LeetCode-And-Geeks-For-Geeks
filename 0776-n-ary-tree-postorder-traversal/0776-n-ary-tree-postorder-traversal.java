/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public void postorderHelper(Node root, List<Integer> postorderList){
        if(root == null){
            return;
        }
        for(int index = 0; index < root.children.size(); index++){
            postorderHelper(root.children.get(index), postorderList);
        }
        postorderList.add(root.val);
        return;
    }
    public List<Integer> postorder(Node root) {
        List<Integer> postorderList = new ArrayList<>();
        postorderHelper(root, postorderList);
        return postorderList;
    }
}