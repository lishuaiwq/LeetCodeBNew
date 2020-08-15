package main.solution;

import java.util.ArrayList;

/***
 *
 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class Solution18 {

    private ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(Solution13.TreeNode root, int target) {
        dfs(root, target, new ArrayList<Integer>());
        return ret;
    }
    public void dfs(Solution13.TreeNode root, int target, ArrayList<Integer> list){
        if(root == null)
            return;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            ret.add(new ArrayList<Integer>(list));
        else {
            dfs(root.left, target, list);
            dfs(root.right, target, list);
        }
        // 回退是当前节点遍历完发现不满足，但是当前元素已经放进去了，所以就进行回退
        list.remove(list.size() - 1);
    }

}