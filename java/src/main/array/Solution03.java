package main.array;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，
 * 因此输出2。如果不存在则输出0。
 *
 * 思路1：排序后，中间那个数字肯定是了，判断他是不是出现大于数组一半。
 * 思路2：
 * 第一次遍历，统计出现次数最多的数字。
 * 第二次遍历，判断出现的次数是不是大于数组的一半。
 */
public class Solution03 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 1;
        int target = array[0];
        for(int i =1 ;i < array.length;i++){
            if(target == array[i]){
                count++;
            }else{
                count -- ;
            }
            if(count == 0){
                target = array[i];
                count = 1;
            }
        }
        count = 1;
        for(int i =1 ;i < array.length;i++){
            if(target == array[i]){
                count ++ ;
            }
        }
        if(count > array.length/2){
            return target;
        }
        return 0;
    }
}
