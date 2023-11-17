package leetcode.top150;


class RemoveElements{

    public static void main(String[] args) {
        int nums [] = new int [] {0,1,2,2,3,0,4,2};
        nums = new int[] {2,3,2,2,3,2};
        int n = new RemoveElements(). removeElement(nums,2);
          for (int k: nums){
            System.out.print(k+",");
        }
        System.out.println("\n "+n);
    }
    public int removeElement(int[] nums, int val) {
        
        int len = nums.length;
        int elements = len;
        int i = 0;
        while(i<len){

        if (nums[i]==val){
            int j =i;
            while(j<len && nums[j]==val){
                j++;
            }
            if(j==len){
                elements--;
                return elements;
            }else{
                nums[i] = nums[j];
                nums[j] = val;
                elements--;
            }
            
        }   
        i++; 
        }

      
        
        return elements;

        
    }
}
