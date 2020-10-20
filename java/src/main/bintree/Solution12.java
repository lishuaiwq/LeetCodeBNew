package main.bintree;

import main.mode.TreeNode;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 层序遍历二叉树
 * 从上到下按层打印二叉树，同一层结点从左至右输出。
 * 每一层输出一行。
 */
public class Solution12 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
         if(pRoot == null){
             return null;
         }
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            int flag = 0;
            int n = queue.size();
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            while (flag++ < n) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if(poll.right != null){
                    queue.add(poll.right);
                }
                arrayList.add(poll.val);
            }
            arrayLists.add(arrayList);
        }
        return arrayLists;
    }
}
