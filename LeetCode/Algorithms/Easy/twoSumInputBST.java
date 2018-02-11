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

    Stack<TreeNode> stack;

  public void BSTIterator(TreeNode root){
    stack = new Stack<TreeNode>();
    while(root != null){
      stack.push(root);
      root = root.left;
    }
  }

  public boolean hasNext(){
    return !stack.isEmpty();
  }

  public int next(){
    TreeNode node = stack.pop();
    int result = node.val;
    if(node.right != null){
      node = node.right;
      while(node != null){
        stack.push(node);
        node = node.left;
      }
    }
    return result;
  }

    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        BSTIterator(root);
        while(hasNext()){
            int val = next();
            if(set.contains(k - val)){
                return true;
            }
            if(!set.contains(val)){
                set.add(val);
            }
        }
        return false;
    }
}
