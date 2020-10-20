package main.bintree;

import com.sun.jmx.remote.internal.ArrayQueue;
import main.mode.TreeNode;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/***
 * 之字型打印二叉树
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 *
 * 思路：层序遍历，偶数位则需要逆转否则不需要
 */
public class Solution11 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot == null){
            return null;
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> arrayQueue = new LinkedBlockingQueue<TreeNode>();
        arrayQueue.add(pRoot);
        boolean cgi = false;
        while (!arrayQueue.isEmpty()){
            int flag = 0;
            int n = arrayQueue.size();
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            while (flag++ < n) {
                TreeNode treeNode = arrayQueue.poll();
                arrayList.add(treeNode.val);
                if (treeNode.left != null) {
                    arrayQueue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    arrayQueue.add(treeNode.right);
                }
            }
            if(cgi){
                // 逆序
            }
            result.add(arrayList);
            cgi = !cgi;
        }
        return result;
    }
}
