package leetcode.array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] arr = // new int[]{1,1,2};
                new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int len = removeDuplicatesStable(arr);
        System.out.println(len);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static int removeDuplicatesStable(int a[]) {
        int left = 0, right = 1;
        int len = a.length;
        while (right < len) {
            if (a[left] >= a[right]) {
                while (a[left] >= a[right] && right < len - 1) {
                    right++;
                }

                if (a[left] == a[right]) {
                    // no more unique
                    break;
                }
                left++;
                a[left] = a[right];
                right = left + 1;
            } else {
                left++;
                right++;
            }
        }
        return left + 1;

    }

    public static int removeDuplicates(int[] nums) {

        int len = nums.length;
        int start = -1;
        int end = -1;
        int pos = 1;
        int dups = 0;
        while (pos < len && end < len - 1) {

            if (start == -1) {
                // no dups yet
                if (nums[pos] == nums[pos - 1]) {
                    start = pos;
                    end = pos;
                    nums[pos] = -1;
                    dups++;
                }
            } else {
                if (nums[start - 1] == nums[end + 1]) {
                    end++;
                    nums[end] = -1;
                    dups++;
                } else {
                    nums[start] = nums[end + 1];
                    start++;
                    end++;
                    nums[end] = -1;
                }
            }

            pos++;

        }

        return len - dups;
    }

}
