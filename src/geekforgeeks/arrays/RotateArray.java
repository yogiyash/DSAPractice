package geekforgeeks.arrays;

import utility.array.ArraysHelper;

/**
 * Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).
 * First line T no of testcases
 * First line of each testcase  contains 2 space separated element , N denote size of arrays and an integer D denoting the number of rotation
 * <p>
 * 3
 * 2 4 6 8 10 12 14 16 18 20
 * 8 10 12 14 16 18 20 2 4 6
 */
public class RotateArray {

    static void rearrage(int[] a, int times) {
        //shift in loop
        int len = a.length;
        for (int x = 0; x < times; x++) {
            int temp = a[len - 1];
            for (int i = len - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }


    }

    public static void main(String[] args) {
        int[] arr = new int[]
                //{2,4,6,8,10,12,14,16,18,20};
                // {-1,-100,3,99};
                {1, 2, 3, 4, 5, 6, 7};


        rearrage(arr, 3);
        ArraysHelper.printArray(arr);


        //reverseArray(arr);
    }

    static void reverseArray(int[] a) {
        int len = a.length;
        int times = len / 2;
        for (int c = 0; c < times; c++) {
            int temp = a[c];
            a[c] = a[len - 1 - c];
            a[len - 1 - c] = temp;
        }
        ArraysHelper.printArray(a);


    }

}
