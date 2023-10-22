package org.example.nums;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class RandomNums {
    Random rnd = new Random();
    int listCount = 5;
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> createRandomList() {
        for (int i = 0; i < listCount; i++) {
            list.add(rnd.nextInt(200) - 100);
        }
        return list;
    }

    public void delNegative(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 0) iterator.remove();
        }
    }

}
