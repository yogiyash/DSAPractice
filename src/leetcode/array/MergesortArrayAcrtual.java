package leetcode.array;

public class MergesortArrayAcrtual {

    public static void main(String[] args) {

        int[] nums1 = new int[] { 8, 6, 3, 0, 0, 0, 0, 0, 0,0 };
        int[] nums2 = new int[] { 9, 7, 5, 4, 3, 2, 1 };
        new MergesortArrayAcrtual().merge(nums1, 3, nums2, 7);
        for (int i : nums1){
            System.out.println(i);
        }
        
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n- 1;
        int k = m+n-1;
        while(i>=0 && j>=0)
        {
            if (nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--]; 
            }
            else
            {
                nums1[k--]=nums2[j--];
            }
        } 
 
         while(i>=0)
        {
             nums1[k--]=nums1[i--]; 
        } 
 
        while(j>=0)
        {
             nums1[k--]=nums2[j--]; 
        }
     
    }
    
}
