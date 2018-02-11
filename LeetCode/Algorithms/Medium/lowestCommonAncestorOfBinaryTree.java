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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null){
        return null;
    }
    if(root == p || root == q){
        return root;
    }

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if(left != null && right != null){
        return root;
    }else if(left == null && right == null){
        return null;
    }else{
        return left == null ? right : left;
    }
    }
}

// or

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          TreeNode m = root;
  if(m.val > p.val && m.val < q.val){
    return m;
  }else if(m.val > p.val && m.val > q.val){
    return lowestCommonAncestor(root.left, p, q);
  }else if(m.val < p.val && m.val < q.val){
    return lowestCommonAncestor(root.right, p, q);
  }
  return root;
    }
}
