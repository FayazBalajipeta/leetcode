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
import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverseInorder(root, result);
        return result;
    }

    private void traverseInorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        traverseInorder(node.left, result);   
        result.add(node.val);                
        traverseInorder(node.right, result); 
    }
}
