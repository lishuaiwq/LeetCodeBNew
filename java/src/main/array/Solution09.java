package main.array;

/***
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置,
 * \如果没有则返回 -1（需要区分大小写）.
 * （从0开始计数
 */
public class Solution09 {

    public int FirstNotRepeatingChar(String str) {
        char[] chars = str.toCharArray();
        int []arr = new int[1024];
        for (int i = 0; i < chars.length; i++) {
            arr[chars[i]]++;
        }
        for(int i=0;i<chars.length;i++){
            if(arr[chars[i]] == 1){
                return i;
            }
        }
        return -1;
    }
}
