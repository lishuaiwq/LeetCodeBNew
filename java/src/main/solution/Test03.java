package main.solution;

import java.util.HashMap;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<Integer,Integer>(3);
        for(int i = 0;i<10000000;i++){
            hashMap.put(new Random().nextInt(),1);
        }
        System.out.println(hashMap.size());
    }
}
