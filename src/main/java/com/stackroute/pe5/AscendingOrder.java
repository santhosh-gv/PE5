package com.stackroute.pe5;

import java.util.*;

public class AscendingOrder {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String[] str = obj.nextLine().split(" ");

        Set set = new HashSet();

        Collections.addAll(set, str);

        TreeSet<String> treeSet = new TreeSet<String>(set);

        System.out.println("Sorted Set : "+ treeSet);

        List<String> list= new ArrayList<String>(treeSet);

        System.out.println("Array list from Set : "+ list);

    }
}
