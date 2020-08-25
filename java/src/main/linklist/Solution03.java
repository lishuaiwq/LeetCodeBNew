package main.linklist;

import main.mode.ListNode;

/***
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 用三个指针就可以实现
 *
 */
public class Solution03 {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;

        while (cur != null){
           next = cur.next;
           cur.next = pre;
           pre = cur;
           cur = next;
        }
        return pre;
     }
}
