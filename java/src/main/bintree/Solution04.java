package main.bintree;

import java.util.*;

/**
 * 从上往下打印出二叉树的每个节点，
 * 同层节点从左至右打印。
 * 层序遍历二叉树
 *
 *
 * 借助队列：将当前节点左子树放入队列，在将其右子树放入队列。然后拿出队列得节点继续以此类推。
 *
 */
public class Solution04 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
        linkedList.add(root);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (!linkedList.isEmpty()){
            TreeNode pop = linkedList.pop();
            arrayList.add(pop.val);
            if(pop.left != null){
                linkedList.add(pop.left);
            }
            if(pop.right != null){
                linkedList.add(pop.right);
            }
        }
        return arrayList;
    }



     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
}
