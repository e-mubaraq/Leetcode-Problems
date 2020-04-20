/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        vector<int> left, right;
        if(preorder.size() == 0) return NULL;
        TreeNode *root = new TreeNode(preorder[0]);
        
        for(int i = 1;i < preorder.size();i++){
            if(root->val < preorder[i])
                right.push_back(preorder[i]);
            else
                left.push_back(preorder[i]);
        }
        
        root->left = bstFromPreorder(left);
        root->right = bstFromPreorder(right);
        
        return root;
    }
};
