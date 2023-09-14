class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key) {
            return getReplacement(root);
        }
        root.left = deleteNode(root.left, key);
        root.right = deleteNode(root.right, key);
        return root;
    }
    public TreeNode getReplacement(TreeNode root) {
        if(root.right == null && root.left == null) return null;
        if(root.right == null) return root.left;
        if(root.left == null) return root.right;
        TreeNode replacement = root.right;
        if(replacement.left == null) {
            replacement.left = root.left;
        } else {
            TreeNode parent = root;
            while(replacement.left != null) {
                parent = replacement;
                replacement = replacement.left;
            }
            parent.left = replacement.right;
            replacement.right = root.right;
            replacement.left = root.left;
        }
        return replacement; 
    }
}