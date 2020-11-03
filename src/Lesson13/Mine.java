package Lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Mine {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("vhjb" + i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Время выпонения ArrayList add:" + (endTime - startTime1));


        LinkedList<String> linkidList = new LinkedList<>();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkidList.add("vhjb" + i);
        }
        Long endTime2 = System.currentTimeMillis();
        System.out.println("Время выпонения LinkedList add:" + (endTime2 - startTime2));



        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        Long endTime3 = System.currentTimeMillis();
        System.out.println("Время выпонения ArrayList get:" + (endTime3 - startTime3));



        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkidList.get(i);
        }
        Long endTime4 = System.currentTimeMillis();
        System.out.println("Время выпонения LinkedList add:" + (endTime4 - startTime4));
    }

}
