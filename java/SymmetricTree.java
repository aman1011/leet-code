//Solution for https://leetcode.com/problems/symmetric-tree
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
    public boolean isSymmetric(TreeNode root) {
       return check(root.left,root.right);
        
    }
    public boolean check(TreeNode leftPart,TreeNode rightPart) {
        if(leftPart==null && rightPart==null)
            return true;
        if(leftPart==null)
            return false;
        return leftPart.val==rightPart.val && check(leftPart.left,rightPart.right)
            && check(leftPart.right,rightPart.left);
    }
}