package main.array;

/**
 * 反转单词顺序，把
 * 例如，“student. a am I”。==>“I am a student.”
 * 1.使用栈，将每个字母放到栈中
 * 2.强行拼接
 */
public class Solution13 {
    public String ReverseSentence(String str) {
        char[] chars = str.toCharArray();
        String ret ="";
           String src="";
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == ' ') {
                ret = ' ' + src + ret;
                src = "";
            } else {
                src = src + chars[i];
            }
        }
           ret = src + ret;
           return ret;
    }
}
