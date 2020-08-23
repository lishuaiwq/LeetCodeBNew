package main.bintree;

/***
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。
 *
 * 二叉搜索树：左子树小于等于跟节点，右子树大于跟节点
 *
 * 左子树一定小于根节点
 * 右子树一定大于跟节点
 *
 * 从左往右走，第一个不小于跟的节点则是右子树的。
 * 开始从右子树往后看看是不是都大于跟节点，如果数组遍历完则说明没问题。
 * 否则就是有问题
 *
 */
public class Solution03 {
    public boolean VerifySquenceOfBST(int [] sequence) {

        int size = sequence.length;
        if(0 == size) return false;

        int i = 0;
        while(--size > 0){
            while(sequence[i] < sequence[size]){
                i++;
            }
            while(sequence[i] > sequence[size])
            {
                i++;
            }
            if(i < size) return false;
            i = 0;
        }

        return true;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Solution03 solution17 = new Solution03();
        System.out.println(solution17.VerifySquenceOfBST(arr));
    }
}
