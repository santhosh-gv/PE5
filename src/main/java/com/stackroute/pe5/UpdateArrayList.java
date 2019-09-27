package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateArrayList {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements in the List");
        int n = obj.nextInt();

        System.out.println("Enter the elements");
        obj.nextLine();

        List<String>  list = new ArrayList<>();

        for (int i=0;i<n;i++)
        {
            list.add(obj.nextLine());
        }

        System.out.println("Enter the string that needs to be updated");
        String update = obj.nextLine();

        System.out.println("Enter the string to update");
        String  updateBy = obj.nextLine();

        if(list.contains(update))
        {
            int index = list.indexOf(update);
            list.set(index,updateBy);

            System.out.println(list);

            list.clear();
            System.out.println("Array list after removing all elements "+list);

        }

        else
        {
            System.out.println("The string you entered does not exist");
            return;
        }



    }
}
