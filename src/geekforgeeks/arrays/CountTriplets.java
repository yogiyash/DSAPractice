package geekforgeeks.arrays;

import java.util.Scanner;

/**
 * The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.
 * For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".
 * Input:
 * 2
 * 4
 * 1 5 3 2
 * 3
 * 3 2 7
 * Output:
 * 2
 * -1
 */
public class CountTriplets {

    static int findTriplets(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for (int t = 0; t < tests; t++) {
            int len = scanner.nextInt();
            String arrString = scanner.next();
            String[] elementString = arrString.split(" ");
            int[] elements = new int[len];
            for (int i = 0; i < len; i++) {
                //s
            }


        }


        return 0;
    }


}
