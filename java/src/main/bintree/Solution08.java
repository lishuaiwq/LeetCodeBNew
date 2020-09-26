package main.bintree;

import main.mode.TreeNode;

import java.util.Queue;
import java.util.concurrent.*;

/**8
 *输入一棵二叉树，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
 * 最长路径的长度为树的深度。
 */
public class Solution08 {


    /***
     * 递归写法
     * 思路：递归比较左右子树谁的结点多，则最后返回的就是谁，则就是二叉树的深度
     * @param root
     * @return
     */
    public int TreeDepth(TreeNode root) {
      if(root == null){
          return 0;
      }
      return Math.max(TreeDepth(root.left) + 1,TreeDepth(root.right) + 1);
    }

    /**
     * 非递归
     * 思路：采用层序遍历的方法，每次将一次的结点消费完，并根据这一层继续入队。然后计数器+1
     */
    public int TreeDepthO1(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> linkedBlockingQueue = new LinkedBlockingQueue<TreeNode>();
        linkedBlockingQueue.offer(root);
        int depth = 0;
        while (!linkedBlockingQueue.isEmpty()){
            depth ++ ;
            for(int i = 0;i<linkedBlockingQueue.size();i++){
                TreeNode poll = linkedBlockingQueue.poll();
                if(poll.left !=null){
                   linkedBlockingQueue.offer(poll.left);
                }
                if(poll.right != null){
                    linkedBlockingQueue.offer(poll.right);
                }
            }
        }
        return depth;
    }

}
