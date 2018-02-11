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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null){
            return ans;
        }
        nodeQueue.offer(root);
        int curLevel = 1, nextLevel = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(!nodeQueue.isEmpty()){
            TreeNode next = nodeQueue.poll();
            curLevel--;
            temp.add(next.val);
            if(next.left != null){
                nodeQueue.offer(next.left);
                nextLevel++;
            }
            if(next.right != null){
                nodeQueue.offer(next.right);
                nextLevel++;
            }
            if(curLevel == 0){
                curLevel = nextLevel;
                nextLevel = 0;
                ans.add(new ArrayList<Integer>(temp));
                temp.clear();
            }
        }
        return ans;
    }
}
