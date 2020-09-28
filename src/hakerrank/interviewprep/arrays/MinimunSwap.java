package hakerrank.interviewprep.arrays;


/*You are given an unordered array consisting of consecutive integers

        [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

        For example, given the array
        we perform the following steps:

        */

public class MinimunSwap {


    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 1, 2};
        System.out.println(minimumSwaps(arr));

    }

    static int minimumSwaps(int[] arr) {
        int len = arr.length;
        int swap = 0;
        for (int i = 1; i <= len; i++) {
            if (arr[i - 1] != i) {

                for (int j = i; j < len; j++) {
                    if (arr[j] == i) {
                        arr[j] = arr[i - 1];
                        arr[i - 1] = i;
                        swap++;
                        break;
                    }
                }
            }
            // else continue
        }
        return swap;

    }


}
