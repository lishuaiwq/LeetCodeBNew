package main.bintree;

import main.mode.TreeNode;

/**
 * 判断二叉树是不是对称的
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的
 */
public class Solution10 {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null)
            return true;
        return _isSymmetrical(pRoot.left,pRoot.right);
    }
    boolean _isSymmetrical(TreeNode left,TreeNode right) {
             if(left == null && right == null){
                 return true;
             }else if(left == null || right == null){
                 return false;
             }else if (left.val != right.val){
                 return false;
             }
             return _isSymmetrical(left.left,right.right);
    }

}
