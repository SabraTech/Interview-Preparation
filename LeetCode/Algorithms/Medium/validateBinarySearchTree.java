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
    public boolean isValidBST(TreeNode root) {
        return isBst(root, null, null);
    }

    public boolean isBst(TreeNode node, TreeNode min, TreeNode max){
        if(node == null){
            return true;
        }
        if((min != null && node.val <= min.val) || (max != null && node.val >= max.val)){
            return false;
        }
        return (isBst(node.left, min, node) && isBst(node.right, node, max));
    }
}
