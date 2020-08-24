package main.bintree;

import java.util.Stack;

/**
 * 题目描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 输入描述:
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 *
 *     	思路，交换左右子树
 *
 *     	递归，非递归
 *
 */


public class Solution05 {
    /**非递归写方**/
    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode pop = stack.pop();
            if (pop.left != null || pop.right != null) {
               TreeNode leftNode = pop.left;
               TreeNode rightNode = pop.right;
                pop.left = rightNode;
                pop.right = leftNode;
            }
            if(pop.left != null) stack.push(pop.left);
            if(pop.right!=null) stack.push(pop.right);
        }
    }

    /**
     * 递归写法
     * @param root
     */
    public void Mirror01(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            return;
        }
        TreeNode  tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null)
            Mirror(root.left);
        if (root.right != null) Mirror(root.right);

    }
    public static class TreeNode {
        int val = 0;
       TreeNode left = null;
       TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

}
