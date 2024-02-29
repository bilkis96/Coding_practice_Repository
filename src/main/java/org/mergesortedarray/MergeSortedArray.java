package org.example;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        List<Integer> arrayList = new ArrayList<>();
        for(int num : nums1)
        {
            arrayList.add(num);
        }
        for(int num : nums2)
        {
            arrayList.add(num);
        }

        arrayList.removeIf(element -> element == 0);

        Collections.sort(arrayList);

        System.out.println("Final output is as below: ");
        //System.out.println("[");
        for(int num : arrayList)
        {
            System.out.println(num);


        }

       //System.out.println();
    }
}
