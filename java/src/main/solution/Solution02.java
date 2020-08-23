package main.solution;

import java.util.*;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *  思路1：利用栈的特性，放进去，在遍历栈拿出来
 *  思路2：递归
 *  思路3：存下来使用反转函数
 *
 *  这里实现递归的思想。
 */

public class Solution02 {

/*
        private static ArrayList<Integer> arrayList = new ArrayList<>();
*/

    public  ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //原创版本
      /*  if (listNode == null) {
            return arrayList;
        }
        printListFromTailToHead(listNode.next);
        arrayList.add(listNode.val);
        return arrayList;*/

/*      if(listNode != null){
          printListFromTailToHead(listNode.next);
          arrayList.add(listNode.val);
      }
      return arrayList;*/
return null;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(81);
        ListNode listNode3 = new ListNode(61);
        ListNode listNode4 = new ListNode(95);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        Solution02 solution02 = new Solution02();
        ArrayList<Integer> arrayList = solution02.printListFromTailToHead(listNode1);
        for(Integer value : arrayList){
            System.out.println(value);
        }
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
