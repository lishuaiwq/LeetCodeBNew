package main.array;

import java.util.ArrayList;
import java.util.List;

/***
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Solution08 {
    public int GetUglyNumber_Solution(int index) {
        // 0 -6 的丑数是自己
        if (index < 7) {
            return index;
        }
        int px2 = 0;
        int px3 = 0;
        int px5 = 0;
        List<Integer> arr = new ArrayList<Integer>();
        int value = 1;
        arr.add(value);
        while (arr.size() < index) {
            value = min(arr.get(px2) * 2, arr.get(px3) * 3, arr.get(px5) * 5);
            arr.add(value);
            if (value == arr.get(px2)*2) px2++;
            if (value == arr.get(px3)*3) px3++;
            if (value == arr.get(px5)*5) px5++;
        }
        return value;
    }

    int min(int a, int b, int c) {
        int tmp = a > b ? b : a;
        return tmp > c ? c : tmp;
    }

    public static void main(String[] args) {
        Solution08 solution08 = new Solution08();
        System.out.println(solution08.GetUglyNumber_Solution(7));
    }
}
