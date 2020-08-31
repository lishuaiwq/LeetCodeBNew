package main.bintree;

import java.util.ArrayList;
import java.util.List;

/***
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 *
 * // 思路：根据前序节点在中序数组中的位置确定跟节点的左右子树，从而建立节点
 */
public class Solution07 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
       if(in.length == 0 || in[0] == 0){
           return null;
       }
       int key = pre[0];
        TreeNode root = new TreeNode(key);
        int mid = 0;
        for(int i = 0 ;i<in.length;i++){
            if(in[i] == key){
                mid = i;
                break;
            }
        }
        int[] leftPre = new int[pre.length];
        int[] leftIn =new int[pre.length];
        int[] rightPre = new int[pre.length];
        int[] rightIn = new int[pre.length];
        //左子树的前序和中序
        int j = 0;
        for(int i=1;i<mid;i++){
            leftPre[j] = pre[i];
            leftIn[j] = in[i-1];
            j++;
        }
        j = 0;
        for(int i = mid + 1;i<in.length;i++){
            rightPre[j] = pre[i];
            rightIn[j] = in[i];
        }
        root.left = reConstructBinaryTree(leftPre,leftIn);
        root.right = reConstructBinaryTree(rightPre,rightIn);
        return root;
    }
      class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
