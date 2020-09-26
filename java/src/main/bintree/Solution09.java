package main.bintree;

import main.mode.TreeNode;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * 私立：先求树的高度，然后在求其差的绝对值是否大于1，如果是则返回false,否则返回true
 */
public class Solution09 {

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return true;
        }
        int threeNodeLeft = getThreeNode(root.left);
        int threeNodeRight = getThreeNode(root.right);
        if(Math.abs(threeNodeLeft - threeNodeRight) > 1){
            return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    private int getThreeNode(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(getThreeNode(root.left) + 1, getThreeNode(root.right) + 1);
    }
}
