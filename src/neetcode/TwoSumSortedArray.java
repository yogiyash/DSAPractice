package neetcode;

public class TwoSumSortedArray {

    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int lo = 0;
        int hi = n - 1;
        while (lo < hi) {
            if (numbers[lo] + numbers[hi] == target) {
                return new int[] { lo + 1, hi + 1 };
            } else if (numbers[lo] + numbers[hi] < target) {
                lo = helper(numbers, target - numbers[hi], lo + 1, hi - 1, true);
            } else {
                hi = helper(numbers, target - numbers[lo], lo + 1, hi - 1, false);
            }
        }
        return new int[] { -1, -1 };
    }

    public int helper(int[] numbers, int target, int lo, int hi, boolean flag) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target == numbers[mid]) {
                return mid;
            } else if (target < numbers[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return flag ? lo : hi;

    }
}
