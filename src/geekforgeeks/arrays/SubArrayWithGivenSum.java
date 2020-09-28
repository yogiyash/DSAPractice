package geekforgeeks.arrays;

import java.util.Scanner;

/**
 * Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
 * The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.
 * print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.
 * <p>
 * examples
 * 2
 * 5 12
 * 1 2 3 7 5
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 */
public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //case 1
        System.out.println("enter array len and sum");
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 15;

        findIndexes(arr, sum);

    }

    static void findIndexes(int[] arr, int sum) {
        int len = arr.length;
        int start = 0, end = 0;
        boolean found = false;
        for (start = 0; start < len - 1; start++) {
            int ls = arr[start];
            end = start + 1;
            while (ls < sum) {
                ls += arr[end++];
            }

            if (sum == ls) {
                System.out.println(String.format("%d %d", ++start, end));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(-1);
        }


    }

}


