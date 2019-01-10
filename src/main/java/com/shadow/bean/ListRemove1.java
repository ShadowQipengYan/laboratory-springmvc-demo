package com.shadow.bean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ListRemove1 {

    public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == 5) {
                list.remove(j);
            }
        }

        outputList(list);
    }

    private static void outputList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "    ");
        }
    }
}