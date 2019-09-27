package com.stackroute.pe5;

import java.util.*;

public class CountString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        String[] strArr = str.split("//.//s");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArr));
        Map<String, Integer> hm = new HashMap<String, Integer>();


        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " " + "occurs" + ": " + val.getValue() + " times");
        }
    }
}
