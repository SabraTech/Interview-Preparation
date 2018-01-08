/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode node = root;
        if(node == null){
            return node;
        }
        invertTree(node.left);
        invertTree(node.right);
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        return node;
    }
}
