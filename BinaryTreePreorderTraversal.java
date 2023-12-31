// Please, open (copy & paste) the following link for the problem description:
// https://leetcode.com/problems/binary-tree-preorder-traversal/description/

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversalHelper(list, root);
        return list;
    }

    public void preorderTraversalHelper(List<Integer> list, TreeNode node) {
        if (node == null) { return; }

        list.add(node.val);
        preorderTraversalHelper(list, node.left);
        preorderTraversalHelper(list, node.right);
    }
}