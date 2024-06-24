package itmo.lab9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {

    static int sizeList = 1000000;
    static int numElements = 100000;

    public static void setListRandomNumbers(List<Double> list) {
        for (int i = 0; i < sizeList; i++) {
            list.add(Math.random() * 10);
        }
        // System.out.println(list);
    }

    public static List<Double> getArrayListRandomElements(List<Double> list) {
        List<Double> res = new ArrayList<>();
        for (int i = 0; i < numElements; i++) {
            res.add(list.get((int) (Math.random() * (numElements - 1))));
        }
        return res;
    }

    public static List<Double> getLinkedListRandomElements(List<Double> list) {
        List<Double> res = new LinkedList<>();
        for (int i = 0; i < numElements; i++) {
            res.add(list.get((int) (Math.random() * (numElements - 1))));
        }
        return res;
    }


}
