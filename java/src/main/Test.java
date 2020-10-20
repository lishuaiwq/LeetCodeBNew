package main;

import main.mode.ListNode;

import java.util.*;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
       final CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行完拉!!");
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1执行");
                try {
                    cyclicBarrier.await();
                    System.out.println("hahha1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2执行");
                try {
                    cyclicBarrier.await();
                    System.out.println("hahha2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
