//Solution for https://leetcode.com/problems/binary-tree-inorder-traversal
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
    List<Integer> inorderTraverse = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        inorder(root);
        return inorderTraverse;
    
    }
    public void inorder(TreeNode root) {
        if(root==null)
            return;
        inorder(root.left);
        inorderTraverse.add(root.val);
        inorder(root.right);
    }
}

//Faster solution


class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null)
            return list;
        inorder(root,list);
        return list;
    
    }
    public void inorder(TreeNode root,List<Integer> list) {
        if(root==null)
            return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}