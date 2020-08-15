package main.solution;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 重点我觉得会问的
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 * 思路:采用哈希表存储
 */
public class Solution19 {

    /***
     * 赋值随机链表
     * @param pHead
     * @return
     */
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return pHead;
        }
        // 保留当前的节点为止
        RandomListNode cur = pHead;
        RandomListNode ret = pHead;
        // 主要存储对应的关系
        Map<RandomListNode, RandomListNode> map = new LinkedHashMap<RandomListNode, RandomListNode>();
        RandomListNode resultRandomListNode = new RandomListNode(cur.label);
        map.put(cur, resultRandomListNode);
        cur = cur.next;
        //开始赋值旧链表
        while (cur != null) {
            RandomListNode newRandomListNode = new RandomListNode(cur.label);
            map.put(cur, newRandomListNode);
            map.get(ret).next = newRandomListNode;
            ret = cur;
            cur = cur.next;
        }
        while (pHead != null) {
            map.get(pHead).random = map.get(pHead.random);
            pHead = pHead.next;
        }
        return resultRandomListNode;
    }

    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
}
