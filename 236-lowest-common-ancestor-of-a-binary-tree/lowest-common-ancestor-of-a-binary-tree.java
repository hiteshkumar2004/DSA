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
        if(root==p||root==q)return root;
        if(find(root.left,p) &&find(root.left,q))return lowestCommonAncestor(root.left,p,q);
        if (find(root.right,p) && find(root.right,q))return lowestCommonAncestor(root.right,p,q);
        return root;
    }
    public static boolean find(TreeNode root, TreeNode p ){
        if(root==null)return false;
        if(root==p)return true;
        return find(root.right,p)||find(root.left,p);
    }
}