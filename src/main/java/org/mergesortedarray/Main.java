package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

            MergeSortedArray merger = new MergeSortedArray();
            Scanner scanner = new Scanner(System.in);

            int m = scanner.nextInt();
            System.out.println("Enter the number of element in array 1: " + m);
            int[] nums1 = new int[m];

            System.out.println("Enter the elements of array 1: ");

            for(int i =0 ; i<m; i++)
            {

                nums1[i] = scanner.nextInt();
            }

            int n = scanner.nextInt();
            System.out.println("Enter the number of element in array 2: " + n);
            int[] nums2 = new int[n];
            System.out.println("Enter the elements of array 2: ");

            for(int i = 0; i<n; i++){
                nums2[i] = scanner.nextInt();
            }

            merger.merge(nums1, m, nums2, n);

            scanner.close();
        }
       // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            //System.out.println("i = " + i);


}