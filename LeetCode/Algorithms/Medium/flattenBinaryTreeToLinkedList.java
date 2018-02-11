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
    public void flatten(TreeNode root) {
        flatten(root, null);
    }

    private TreeNode flatten(TreeNode root, TreeNode pre){
        if(root == null){
            return pre;
        }

        pre = flatten(root.right, pre);
        pre = flatten(root.left, pre);

        root.right = pre;
        root.left = null;

        pre = root;
        return pre;
    }
}
