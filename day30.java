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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return (check(root, arr, 0));   
    }
    
    private boolean check(TreeNode root, int[] arr, int index) {
        if (root == null)
            return false;
        if (arr[index] != root.val)
            return false;
        if (index ==  arr.length -1)
            return (root.left == null && root.right == null);
        
        return (check(root.left, arr, index + 1) || check(root.right, arr, index + 1));
    }
}
