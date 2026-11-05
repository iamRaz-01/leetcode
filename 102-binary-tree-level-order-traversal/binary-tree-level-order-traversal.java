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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> arr =  new ArrayList<>();
         if(root == null) return arr;
         Queue<TreeNode> q =  new LinkedList<>();
         q.offer(root);
         while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ar =  new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
                TreeNode nod =  q.poll();
                ar.add(nod.val);
                if(nod.left != null){
                    q.offer(nod.left);
                }
                if(nod.right != null){
                    q.offer(nod.right);
                }
            }
            arr.add(ar);
         } 
         return arr;
           
    }
}