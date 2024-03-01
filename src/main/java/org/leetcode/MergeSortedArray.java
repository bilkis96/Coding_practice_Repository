package org.example;

import org.w3c.dom.ls.LSInput;

import java.util.*;

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

    public void callMergeFunction(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of element in array 1: " );
        int m = scanner.nextInt();

        int[] nums1 = new int[m];

        System.out.println("Enter the elements of array 1: ");

        for(int i =0 ; i<m; i++)
        {

            nums1[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of element in array 2: ");
        int n = scanner.nextInt();

        int[] nums2 = new int[n];
        System.out.println("Enter the elements of array 2: ");

        for(int i = 0; i<n; i++){
            nums2[i] = scanner.nextInt();
        }

        merge(nums1, m, nums2, n);

        scanner.close();
    }
    // System.out.printf("Hello and welcome!");

    // Press Shift+F10 or click the green arrow button in the gutter to run the code.
    //for (int i = 1; i <= 5; i++) {

    // Press Shift+F9 to start debugging your code. We have set one breakpoint
    // for you, but you can always add more by pressing Ctrl+F8.
    //System.out.println("i = " + i);
}
