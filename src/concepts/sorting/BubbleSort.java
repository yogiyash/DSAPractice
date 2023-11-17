package concepts.sorting;

import utility.array.ArraysHelper;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Simplest Sorting  algortihm , work by swapping adjecent elements
 */

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = new int[]{5, 8, 4, 2, 1};
        sort(arr);
    }


    static void sort(int[] arr) {
        int len = arr.length;
        int temp = 0;
        for (int i = 1; i < len; i++) {
            System.out.println("pass" + (i));
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            ArraysHelper.printArray(arr);
        }


    }
}