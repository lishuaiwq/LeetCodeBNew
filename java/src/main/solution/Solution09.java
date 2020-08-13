package main.solution;

/***
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * 思路1：快慢指针，快指针先走k-1步，然后慢指针和快指针一起走
 * 思路2：放在栈中，然后取栈中的元素
 */
public class Solution09 {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 1;
        while (fast.next != null){
            if(count++ > k - 1){
                slow = slow.next;
            }
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution09 solution09 = new Solution09();
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        System.out.println(solution09.FindKthToTail(listNode,5).val);

    }
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
