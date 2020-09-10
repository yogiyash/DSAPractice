package lc.array;

public class RemoveDuplicateFromSortedArray {


    public static void main(String[] args) {
        int arr[] =// new int[]{1,1,2};
                new int[]{0,0,1,1,1,2,2,3,3,4};

        int len = removeDuplicates(arr);
        System.out.println("new array len :"+len);
        ArraysHelper.printArray(arr);
    }

    public static int removeDuplicates(int[] nums) {

        int len = nums.length;
        int start=-1;
        int end=-1;
        int pos=1;
        int dups=0;
        while(pos<len&&end<len-1){

            if(start==-1){
                //no dups yet
              if(nums[pos]==nums[pos-1]) {
                  start = pos;
                  end = pos;
                  nums[pos] = -1;
                  dups++;
              }
            }else{
                if(nums[start-1]==nums[end+1]){
                    end++;
                    nums[end]=-1;
                    dups++;
                }else{
                    nums[start]=nums[end+1];
                    start++;
                    end++;
                    nums[end]=-1;
                }
            }

            pos++;

        }

    return  len-dups;
    }

}
