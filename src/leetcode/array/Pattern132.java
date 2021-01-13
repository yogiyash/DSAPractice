package leetcode.array;

public class Pattern132 {


    public boolean find132pattern(int[] nums) {

        int len = nums.length;

        if(len < 3)
            return false;

        int i=0;


        while(i+2<len){

            if(nums[i+1]>nums[i+2] && nums[i+1]>nums[i] && nums[i+2]>nums[i]){
                return true;
            }
            i++;
        }
        return false;


    }

    public static void main(String[] args) {

        int arr[] = new int [] {3,5,0,3,4};
        System.out.println(new Pattern132().find132pattern(arr));




    }

}
