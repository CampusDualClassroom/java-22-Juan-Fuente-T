package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise22 {

    public static List<String> createArrayList() {
        String[] elements = {"GKFFD","TNANA", "MPMSL", "PSWME", "LZMLF", "JYEBV", "YELNT", "JSNKR", "JFESF", "TMJLL"};
//        List<String> newList = new ArrayList<>();
//        newList.addAll(Arrays.asList(elements));
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (String element: customList){
            System.out.println(element);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
       ArrayList<String> newArrayList = (ArrayList<String>) createArrayList();
       addElementToList(newArrayList, "AAAAA");
       printElementsAndIndex(newArrayList);
    }

}
