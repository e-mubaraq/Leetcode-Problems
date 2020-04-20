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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode tree = new TreeNode(preorder[0]);
        if (preorder.length == 1)
            return tree;   
        
        for (int i = 1; i < preorder.length; i++)
            insert(tree, preorder[i]);
        
        return tree;
    }
    
    public void insert(TreeNode tree, int val) {
        if (tree.val > val) {
            if (tree.left == null)
                tree.left = new TreeNode(val);
            else
                insert(tree.left, val);
        }
        else {
            if (tree.right == null)
                tree.right = new TreeNode(val);
            else
                insert(tree.right, val);
        }
    }
}
