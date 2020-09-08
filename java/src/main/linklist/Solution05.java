package main.linklist;

import main.mode.ListNode;

/***
 * 输入两个链表，找出它们的第一个公共结点。（注意因为传入数据是链表，
 * 所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 */
public class Solution05 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
         if(pHead1 == null || pHead2 == null){
             return null;
         }
        ListNode tmpHead1 = pHead1;
        ListNode tmpHead2 = pHead2;
         while (pHead1 != pHead2){
             pHead1 = pHead1 == null ? tmpHead2 : pHead1.next;
             pHead2 = pHead2 == null ? tmpHead1 : pHead2.next;
         }
         return pHead1;
    }
}
