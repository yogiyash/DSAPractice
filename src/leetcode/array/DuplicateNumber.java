package leetcode.array;


/**
 * find the one and only duplicate number
 */
public class DuplicateNumber {

    public static void main(String[] args) {
        int arr [] = new int[]{1,3,4,2,2};
        System.out.println(new DuplicateNumber().findFast(arr));
    }

    public int findDuplicate(int[] nums) {
        int len = nums.length;

        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                if(i==j){
                    if(nums[len-1-j]==nums[i]){
                        return nums[i];
                    }
                } else if(len-1-j==i ){if(nums[j]==nums[i]) {
                    return nums[i];
                }}
                else if(nums[len-1-j]==nums[i] || nums[j]==nums[i])
                    return nums[i];
            }
        }
        return -1;

    }

    /**
     * enlightenment
     * @param nums
     * @return
     */
    public int findFast(int nums[]){

            int slow = nums[0];
            int fast = nums[0];
            do{
                slow = nums[slow];
                fast = nums[nums[fast]];
            }while(slow != fast);
            fast = nums[0];

            while(slow != fast){
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }



}
