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
    public int[] rec(TreeNode root){
        if(root.left == null && root.right == null){
            return new int[] {root.val , 1 , 1};
        }
        int sum = root.val;
        int ans = 0;
        int div = 1;
        if(root.left != null){
            int[] left = rec(root.left);
            sum += left[0];
            ans += left[1];
            div += left[2];
        }
        if(root.right != null){
            int[] right = rec(root.right);
            sum += right[0];
            ans += right[1];
            div += right[2];
        }
        if(sum/div == root.val){
            return new int[] {sum , ans+1 , div};
        }else{
            return new int[] {sum , ans , div};
        }        
    }
    public int averageOfSubtree(TreeNode root) {
        int[] arr = rec(root);
        return arr[1];
    }
}