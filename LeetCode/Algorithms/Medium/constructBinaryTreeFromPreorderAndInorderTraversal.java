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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length != inorder.length){
            return null;
        }
        HashMap<Integer, Integer> inMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inMap.put(inorder[i], i);
        }
        return buildHelper(0, preorder.length - 1, 0, inorder.length - 1, preorder, inMap);
    }

    private TreeNode buildHelper(int preStart, int preEnd, int inStart, int inEnd, int[] preorder, HashMap<Integer, Integer> inMap){
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = buildHelper(preStart + 1, preStart + numsLeft, inStart, inRoot - 1, preorder, inMap);
        root.right = buildHelper(preStart + numsLeft + 1, preEnd, inRoot + 1, inEnd, preorder, inMap);

        return root;
    }
}
