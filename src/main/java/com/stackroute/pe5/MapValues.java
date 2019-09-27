package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapValues {

    private static void modifyMap(Map hashMap)
    {
        Iterator ite = (Iterator) hashMap.entrySet();
        if(ite.hasNext())
        {

        }
        else
        {

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter 2 values of key-value pairs");
        Scanner obj = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        map.put("val1",obj.nextLine());
        map.put("val2",obj.nextLine());

        modifyMap(map);
    }

}
