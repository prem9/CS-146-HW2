package com.example;

//necessary packages

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        int[] intoflist = new int[50];
        intoflist = arrayOfInt();
        intoflist = bubblesort(intoflist);
        toString(intoflist);

    }
    //prints array
    public static void toString(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // sorts through bubble sort method
    public static int[] bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    // reads the txt file and creates array of ints
    public static int[] arrayOfInt() {
        int[] listOfints = new int[50];
        Scanner scn = new Scanner(System.in);
        try {
            scn = new Scanner(new File("F:/Github/CS-146-HW2/demo/src/main/java/com/example/arr1-2.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int i = 0;
        while (scn.hasNext()) { // while there is another token to read
            int s = scn.nextInt(); // reads in the String tokens "Hello" "CSstudents"
            listOfints[i] = s;
            i++;
        }

        // BufferedReader reader = new BufferedReader(new
        // FileReader("F:/Github/CS-146-HW2/demo/src/main/java/com/example/arr1-2.txt"));
        return listOfints;
    }
}
