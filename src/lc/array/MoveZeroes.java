package lc.array;

public class MoveZeroes {


    public static void main(String[] args) {
        int  nums[]= new int[]{0,1,0,3,0};
        moveZeroes(nums);
        ArraysHelper.printArray(nums);

    }


    public static  void moveZeroes(int[] nums) {
        int len = nums.length;
        int zs=-1;
        int ze=-1;
        int pos=0;
        // 1 0 0 2
        while(ze<len-1&&pos<len){

            if(nums[pos]!=0){
                if(zs>-1){
                    ze++;
                    int temp = nums[ze];
                    nums[ze]=0;
                    nums[zs]=temp;
                    zs++;
                }
            }else{

                if(zs==-1){
                    //inititialize
                    zs=pos;ze=pos;
                }else{
                    ze++;
                }
            }
            pos++;

        }
    }
}
