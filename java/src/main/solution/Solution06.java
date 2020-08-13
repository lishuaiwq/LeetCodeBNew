package main.solution;

/**8
 *问题1：大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 *
 * 0 1 1 2 3 5 8
 *
 * 问题2：两个写法是一样得
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 1 2 3 5
 *
 *
 */
public class Solution06 {
    // 递归写法
    public int Fibonacci(int n) {

        if(0 == n){
            return 0;
        }

        if(1 == n  || 2 == n){
            return 1;
        }

        return Fibonacci(n - 1) + Fibonacci(n -2) ;
    }

    /***
     * 非递归写法
     * @param n
     * @return
     */
    public int Fibonacci01(int n) {

        int a=1,b=1,c=0;
        if(0 == n){
           return a;
        }

        if(1 == n  || 2 == n){
           return b;
        }

        //0 1 1 2 3 5 8
        for (int i = 3; i <= n; i++) {
            c = a + b; // c = 1 + 1   c = 2 + 1
            b = a;    // b = 1
            a = c;   //  a = 2
        }
        return c;
    }

    /***
     *  *问题3： 变态青蛙跳台阶
     *  * f(n) = f(n -1) + f(n -2) + ...+f(0)
     *  * f(n -1) = f(n-2)+...f(0)
     *  *
     *  * f(n) = 2f(n -1)
     */
    public int Fibonacci02(int n) {
        if(0 == n || 1 == n){
            return 1;
        }
        int a = 1,b =0;
       for(int i = 2;i<=n ; i++){
           b = a << 1;
           a = b;
       }
       return b;
    }


    /***
     * 问题：
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
     * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法
     * 比如n=3时，2*3的矩形块有3种覆盖方法：
     * @param args
     */
    public static void main(String[] args) {
        Solution06 solution06 = new Solution06();
        System.out.println(solution06.Fibonacci(6));
    }
}
