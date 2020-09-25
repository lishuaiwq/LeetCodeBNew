package main.solution;

import java.util.HashMap;

public class PerSon {

    private String name;

    public PerSon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        HashMap hashMap  = new HashMap(2);
        PerSon perSon = new PerSon("1");
        PerSon perSon1 = new PerSon("1");
        PerSon perSon2 = new PerSon("2");
        for(int i=0;i<10;i++){
            hashMap.put(new PerSon(String.valueOf(i)),perSon);
        }
        hashMap.put(new PerSon(String.valueOf(1)),perSon);

    }
}
