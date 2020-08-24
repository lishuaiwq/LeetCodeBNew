package main.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/***
 *输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4。
 * 使用大小堆来实现。
 * 完全二叉树
 */
public class Solution02 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        // 默认是小顶堆
/*        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(4);*/

        if( k <= 0 || k > input.length){
            return new ArrayList<Integer>();
        }
        //大顶堆
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for(int i=0;i<input.length;i++){
            if(minHeap.size() != k){
                // offer在队尾放入元素
                minHeap.offer(input[i]);
            }else if(minHeap.size() != 0 && minHeap.peek() > input[i]){
                // peek获取队首元素，不会删除队首元素
                // poll获取队首元素，并且会删除元素
                minHeap.poll();
                minHeap.offer(input[i]);
            }
        }
        return new ArrayList<Integer>(minHeap);

    }
}
