/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    boolean isSubtree(TreeNode root, TreeNode sub) {
        if (root == null)
            return false;
        if (isSameTree(root, sub))
            return true;
        return isSubtree(root.left, sub)
                || isSubtree(root.right, sub);
    }
    boolean isSameTree(TreeNode root , TreeNode sec){
        if(root == null && sec == null)return true;
        if(root == null || sec == null)return false;
        if(root.val != sec.val) return false;
        return isSameTree(root.left,sec.left) && isSameTree(root.right,sec.right);
    }

}