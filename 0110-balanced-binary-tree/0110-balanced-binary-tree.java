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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }

   int leftHeight = isheight(root.left);
        int rightHeight = isheight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
         return isBalanced(root.left) && isBalanced(root.right);
    }
 public int isheight(TreeNode root){
    if(root==null){
        return 0;
    }
    return 1+ Math.max(isheight(root.left),isheight(root.right));
 }
}