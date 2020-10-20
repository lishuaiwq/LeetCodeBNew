package main.linklist;

import main.mode.ListNode;

/**
 * 删除链表重复节点
 * 1.记录重复节点删除
 * 2.新建立节点删除
 * 3.遍历一遍删除
 *
 */
public class Solution07 {
    public ListNode deleteDuplication(ListNode pHead) {
           if(pHead == null || pHead.next == null){
               return null;
           }
        ListNode listNode = new ListNode(0);
        listNode.next = pHead;

        ListNode p1 = listNode;
        ListNode p2 = pHead;
        while (p2 != null){
            // 开头两个就相等
            if(p2.next != null && p2.val == p2.next.val){
                while (p2.next != null && p2.val == p2.next.val){
                    p2 = p2.next;
                }
                p2 = p2.next;
                p1.next = p2;
            }else {
                p1 = p2;
                p2 = p2.next;
            }
        }
     return listNode.next;
    }
}
