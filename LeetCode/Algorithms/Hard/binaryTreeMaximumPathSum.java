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
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        maxPath(max, root);
        return max[0];
    }

    private int maxPath(int[] max, TreeNode root){
        if(root == null){
            return 0;
        }
        int leftMax = Math.max(0, maxPath(max, root.left));
        int rightMax = Math.max(0, maxPath(max, root.right));
        max[0] = Math.max(max[0], root.val + leftMax + rightMax);
        return root.val + Math.max(leftMax, rightMax);
    }
}
