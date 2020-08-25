package main.linklist;


import main.mode.ListNode;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 思路：先比较两个链表头节点，比大小，如果小就继续比，比到大于为止，然后插入。
 */
public class Solution02 {


    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 != null && list2 == null) {
            return list1;
        } else if(list1 == null){
            return list2;
        }

       ListNode newNode = new ListNode(1);
        ListNode listNode = newNode;
        ListNode listNode1 = list1;
        ListNode listNode2 = list2;
        while (listNode1!= null && listNode2!=null){
            if (listNode1.val > listNode2.val) {
                listNode.next = listNode2;
                listNode = listNode2;
                listNode2 = listNode2.next;
            } else {
                listNode.next = listNode1;
                listNode = listNode1;
                listNode1 = listNode1.next;
            }
        }
        if(listNode1 == null){
            listNode.next = listNode2;
        }else {
            listNode.next = listNode1;
        }
        return newNode.next;
    }

}
