package main.array;

/**
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution06 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            /*
             * 用1和n进行位与运算，
             * 结果要是为1则n的2进制形式
             * 最右边那位肯定是1，否则为0
             */
            if ((n & 1) == 1) {
                count++;
            }
            //把n的2进制形式往右推一位
            //这样会导致最终死循环，因为负数右移动的过程中，最高位补1
            /**
             * 计算机中存的bai是补码
             * （以8位为例）
             * -5 原码du为 1 000 0101
             * 反码为： 1 111 1010
             * 补码为： 1 111 1011 这就是-5的补zhi码
             * 按位右移2位，则变成：dao 1 111 1110 这是-2的补码
             *
             * 在机器中，数的二进制码都是其补码。
             *
             * ① 负数的右移：需要保持数为负数，所以操作是对负数的二进制位左边补1。如果一直右移，最终会变成-1，即(-1)>>1是-1。
             *
             * ② 负数的左移：和整数左移一样，在负数的二进制位右边补0，
             * 一个数在左移的过程中会有正有负的情况，所以切记负数左移不会特殊处理符号位。如果一直左移，最终会变成0。
             */
            n = n >> 1;
        }
        return count;
    }


    /**
     * 正解使用1向左移动和n每一位去比较，最后1就等于0了
      * @param n
     * @return
     */
  public int NumberOf2(int n){
          int flag = 1;
         int count = 0;
         while (flag != 0){
              if((n & flag) != 0){
                 ++count;
              }
             flag = flag << 1;
         }
         return count;
  }

    /***
     * 最优解如下
     * @param n
     * @return
     */
    public int NumberOf3(int n){
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
