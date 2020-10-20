package main.array;

import java.util.ArrayList;

/***
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 * 因为是递增数组，所以呢两边到中间的乘积越来越大,所以从两边向中间找
 */
public class Solution12 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
           ArrayList<Integer> arrayList = new ArrayList<Integer>();
           int left = 0;
           int right = array.length - 1;
           while (left < right){
               int cur = array[left] + array[right];
               if( cur == sum){
                   arrayList.add(array[left]);
                   arrayList.add(array[right]);
                   break;
               }else if(cur < sum){
                   left++;
               }else {
                   right--;
               }
           }
           return arrayList;
    }
}
