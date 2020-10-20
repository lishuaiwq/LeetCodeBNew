package main.linklist;

import main.mode.ListNode;

/***
 * 求链表中的环的入口点
 * // 即相遇点到环的入口处和起点到环的入口处相等
 *
 * x + y + nL = 2(x + y)
 * L = y + z
 *
 * ===> x=(n -1)+Z 当n = 1即x = z
 */
public class Solution06 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null && pHead.next == null){
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                  fast = pHead;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }

        }
        return null;
    }
}
