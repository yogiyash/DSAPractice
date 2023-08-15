package leetcode.array;

/**
 * count maximum number of consecutive ones in an array
 */
public class MaximumSumOfSubArray {

    public int findMaxConsecutiveOnes(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0 ;
        for (int i =0;i< k ;i++){
            maxSum+=nums[i];  
        }
        for (int i =1; i< nums.length-k; i++) {
             sum =  maxSum-nums[i-1] + nums[i+k-1];
            maxSum = sum>maxSum?sum:maxSum;
        }

     
        return maxSum;

    }
}
