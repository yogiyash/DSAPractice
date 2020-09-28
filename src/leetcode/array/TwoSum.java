package leetcode.array;

import utility.array.ArraysHelper;

import java.util.HashMap;

public class TwoSum {


    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] arr1 = new int[]{3, 2, 4};
        int target1 = 6;
        ArraysHelper.printArray(twoSum1(arr1, target1));


    }

    public static int[] twoSum(int[] nums, int target) {

        int len = nums.length;


        for (int start = 0; start < len - 1; start++) {

            for (int end = start + 1; end < len; end++) {

                if (start + end == target) {
                    return new int[]{start, end};
                }

            }


        }
        return new int[2];

    }


    public static int[] twoSum1(int[] nums, int target) {

        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < len; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < len; i++) {
            int first = nums[i];
            int second = target - first;
            Integer val = map.get(second);
            if (val != null && val != i) {
                result[0] = i;
                result[1] = val;
                break;
            }

        }

        return result;
    }


}
