package main.solution;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("...");
                try {
                    Thread.sleep(1000*50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("...");
            }
        });
    }
}
