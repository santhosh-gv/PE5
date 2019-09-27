package com.stackroute.pe5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapCount {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        String[] strArr = obj.nextLine().split(",");

        Map<String,Boolean> map = new TreeMap<>();

        for(int i=0;i<strArr.length;i++)
        {
            if(map.containsKey(strArr[i]))
            {
                map.put(strArr[i],true);
            }
            else
            {
                map.put(strArr[i], false);
            }
        }

        System.out.println(map);
    }
}
