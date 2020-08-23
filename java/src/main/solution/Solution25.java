package main.solution;

import java.util.*;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 *
 * 思路：转换成string以后对齐进行排序。
 */
public class Solution25 {
    public static final String a = "1";
    public String PrintMinNumber(int [] numbers) {
         String [] trans = new String[numbers.length];

         for(int i = 0;i<numbers.length;i++){
             trans[i] = String.valueOf(numbers[i]);
         }
        List<String> list = Arrays.asList(trans);
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;
                return a.compareTo(b);
             }
        });
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<list.size();i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
