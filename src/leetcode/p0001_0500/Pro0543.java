package leetcode.p0001_0500;

import base.TreeNode;

import java.util.Map;

public class Pro0543 {
    class Solution {
        int res;
        public int diameterOfBinaryTree(TreeNode root) {
            res = 1;
            depth(root);
            return res - 1;
        }

        private int depth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int ld = depth(node.left);
            int rd = depth(node.left);
            res = Math.max(res, ld + rd + 1);
            return Math.max(ld, rd) + 1;
        }
    }
}
