package leetcode.array;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {

            int digits = 0;
            while (num > 0) {
                num = num / 10;
                digits++;
            }

            if (digits % 2 == 0)
                count++;
        }
        return count;
    }

}
