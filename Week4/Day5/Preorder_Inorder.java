import java.util.HashMap;

class Solution {

    private int preIndex = 0;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // Store inorder value -> index
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {

        // Base case
        if (left > right) {
            return null;
        }

        // Root node
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        // Find root index in inorder
        int mid = map.get(rootVal);

        // Build left subtree
        root.left = build(preorder, left, mid - 1);

        // Build right subtree
        root.right = build(preorder, mid + 1, right);

        return root;
    }
}
