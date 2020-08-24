package main.bintree;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution06 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null)return false;
        //根节点，左子树和其比较，右子树和其比较
        return isSubTree(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    boolean isSubTree(TreeNode root1, TreeNode root2){
        /**子树遍历完了，证明是子树没问题**/
        if(root2 == null) return true;
        /**子树没遍历完，主树完了则不是子树**/
        if(root1 == null) return false;

        if(root1.val == root2.val){
            return isSubTree(root1.left,root2.left) && isSubTree(root1.right,root2.right);
        }
        return false;
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
