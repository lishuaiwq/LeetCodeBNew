package main.bintree;

import main.mode.TreeNode;

import java.util.ArrayList;

/***
 *跟定的二叉搜索树，求其倒数第K大小的
 */
public class Solution13 {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null){
            return null;
        }
        ArrayList<TreeNode> arrayList = new ArrayList<TreeNode>();
        _KthNode(pRoot,arrayList);
        if(k > arrayList.size() || k < 1){
            return null;
        }
        return arrayList.get(k-1);
    }

    void _KthNode(TreeNode pRoot, ArrayList<TreeNode> arrayList){
        if(pRoot == null){
            return;
        }
        _KthNode(pRoot.left,arrayList);
        arrayList.add(pRoot);
        _KthNode(pRoot.right,arrayList);
    }
}
