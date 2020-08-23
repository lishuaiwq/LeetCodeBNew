package main.bintree;

/***
 * 输入一棵二叉搜索树，
 * 将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 右子树指向上一级，左子树指向下一级
 */
public class Solution01 {

    // 记录前一个节点
    private TreeNode prePhead;
    // 记录链表的头节点
    private TreeNode firstNode;
    public TreeNode Convert(TreeNode pRootOfTree) {
          conver(pRootOfTree);
          return firstNode;
    }

    public void conver(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return;
        conver(pRootOfTree.left);
        // 最左边的节点
        if (prePhead == null) {
            firstNode = pRootOfTree;
            prePhead = pRootOfTree;
        } else {
            prePhead.right = pRootOfTree;
            pRootOfTree.left = pRootOfTree;
            // 更新当前的节点
            prePhead = pRootOfTree;
        }
        conver(pRootOfTree.right);
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
