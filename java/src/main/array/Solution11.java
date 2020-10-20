package main.array;

import java.util.ArrayList;

/**
 *
 * 和为S的连续正数序列
 * 链接：https://www.nowcoder.com/questionTerminal/c451a3fd84b64cb19485dad758a55ebe
 * 来源：牛客网
 *
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 *
 *
 * 思路：两个指针，类似于滑动窗口的东西
 */
public class Solution11 {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
      ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
      int left = 1;
      int right = 2;
      while (right > left){
          int curTotal = ( right + left)*(right- left + 1) / 2;
          if(curTotal > sum){
              ++left;
          }else if(curTotal < sum){
              right++;
          }else {
              ArrayList<Integer> arrayListTmp = new ArrayList<Integer>();
              for(int i = left ; i <= right ; i++){
                  arrayListTmp.add(i);
              }
              arrayList.add(arrayListTmp);
              left++;
          }
      }
      return arrayList;
    }
}
