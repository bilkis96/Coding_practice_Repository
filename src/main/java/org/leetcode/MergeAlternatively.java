package org.leetcode;

import java.util.Scanner;

public class MergeAlternatively {

    public String mergestringalternatively(String word1, String word2){
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i< word1.length() || i< word2.length()){

            if(i< word1.length()){
                result.append(word1.charAt(i));
            }

            if(i< word2.length()){
                result.append(word2.charAt(i));
            }
            i++;
        }
        String finalAns = result.toString();
        System.out.println("final output is: " + finalAns);
        return finalAns;
    }

    public void callmergestringalternatively(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the first string: ");
        String word1 = scanner.nextLine();
        System.out.printf("Enter the second string: ");
        String word2 = scanner.nextLine();
        mergestringalternatively(word1, word2);
        scanner.close();

    }
}
