package leetcode.array;

/**
 * count maximum number of consecutive ones in an array
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int sum = 0;
        for (int num : nums) {

            if (num == 0) {

                if (maxConsecutiveOnes < sum) {
                    maxConsecutiveOnes = sum;
                }
                sum = 0;
            } else if (num == 1) {
                sum++;
            }


        }

        if (sum > 0 && sum > maxConsecutiveOnes)
            maxConsecutiveOnes = sum;

        return maxConsecutiveOnes;

    }
}
