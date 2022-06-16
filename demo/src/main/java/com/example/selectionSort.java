package com.example;

//necessary packages

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class selectionSort {
    public static void main(String[] args) {

        int[] intoflist = new int[50];
        intoflist = arrayOfInt();
        intoflist = selectionsort(intoflist);
        toString(intoflist);

    }

    // prints array
    public static void toString(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // sorts through selection sort method
    public static int[] selectionsort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // reads the txt file and creates array of ints
    public static int[] arrayOfInt() {
        int[] listOfints = new int[50];
        Scanner scn = new Scanner(System.in);
        try {
            scn = new Scanner(new File("F:/Github/CS-146-HW2/demo/src/main/java/com/example/arr2-1.txt"));
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        int i = 0;
        while (scn.hasNext()) {
            int s = scn.nextInt();
            listOfints[i] = s;
            i++;
        }

        return listOfints;
    }
}
