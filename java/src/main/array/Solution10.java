package main.array;

import java.util.HashSet;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字
 * 思路：1.使用hashSet。将数字放进去，成功返回true，说明不存在，失败的话说明存在，并且移除hashSet中的元素，最后数组中留下的就是不重复的两个了
 * 思路2：使用异或，相同的数字会消除，最后得到不同的两个人数字的异或结果。
 * 找出这个数字中第一个不为1的位。然后根据这个位将数组再次分为两组即可
 */
public class Solution10 {
    /**
     * 方法1.使用HashSet
     * @param array
     * @param num1
     * @param num2
     */
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
           HashSet<Integer> hashSet = new HashSet<Integer>();
           int index = 0;
           for(int i = 0;i<array.length;i++){
               if(hashSet.add(array[i])){
                   hashSet.add(array[i]);
               }else {
                   hashSet.remove(array[i]);
               }
           }
        Object[] objects = hashSet.toArray();
        num1[0] = Integer.valueOf((Integer) objects[0]);
        num1[0] = Integer.valueOf((Integer) objects[1]);

    }

    /**
     * 采用位运算
     * @param array
     * @param num1
     * @param num2
     */
    public void FindNumsAppearOnceO2(int [] array,int num1[] , int num2[]) {
         int num = 0;
        for(int i = 0;i<array.length;i++){
            num ^= array[i];
       }
       int count = 0;
       for (;count < 32;count++){
           if((num &1<<count) != 0){
               break;
           }
       }
       num1[0] = 0;
       num2[0] = 0;
       for(int i = 0;i<array.length;i++){
           if((array[i]& 1 << count) == 0){
               num1[0] ^= array[i];
           }else {
               num2[0] ^= array[i];
           }
       }

    }

        public static void main(String[] args) {

    }
}
