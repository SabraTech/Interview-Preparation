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
    public int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode p = root;
    while(p!=null){
        stack.push(p);
        p=p.left;
    }
    int i=0;
    while(!stack.isEmpty()){
        TreeNode t = stack.pop();
        i++;

        if(i==k)
            return t.val;

        TreeNode r = t.right;
        while(r!=null){
            stack.push(r);
            r=r.left;
        }

    }

    return -1;
    }
}
