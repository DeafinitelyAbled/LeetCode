// Please, open (copy & paste) the following link for the problem description:
// https://leetcode.com/problems/binary-tree-postorder-traversal/description/

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversalHelper(list, root);
        return list;
    }

    public void postorderTraversalHelper(List<Integer> list, TreeNode node) {
        if (node == null) { return; }

        postorderTraversalHelper(list, node.left);
        postorderTraversalHelper(list, node.right);
        list.add(node.val);
    }
}