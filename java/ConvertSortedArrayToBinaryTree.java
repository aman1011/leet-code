//Solution to https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
    
        return sortedBinaryTree(nums,0,nums.length);
        
    }
    public TreeNode sortedBinaryTree(int[] nums,int start,int end) {   
        if(start>=end)
            return null;
        int mid=start+((end-start)/2);
        TreeNode root=new TreeNode(nums[mid]);
        root.left=sortedBinaryTree(nums,start,mid);
        root.right=sortedBinaryTree(nums,mid+1,end);
        
        return root;
        
    }
}