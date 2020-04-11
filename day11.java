/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int max(int a, int b);
int getTreeHeight(struct TreeNode* tree);

int diameterOfBinaryTree(struct TreeNode* root){
    int leftHeight, rightHeight, leftDiam, rightDiam;
    if(root == NULL)
        return 0;
    
    leftHeight  = getTreeHeight(root->left);
    rightHeight = getTreeHeight(root->right);
    
    leftDiam  = diameterOfBinaryTree(root->left);
    rightDiam = diameterOfBinaryTree(root->right);
    
    return(max(leftHeight+ rightHeight, max(leftDiam, rightDiam)));
}

int max(int a, int b) {
	if (a > b)
		return a;
	else
		return b;
}

int getTreeHeight(struct TreeNode* node) {
	if (node == NULL) {
        return 0;  
    }
    return (1+ max(getTreeHeight(node->left), getTreeHeight(node->right))); 
}
