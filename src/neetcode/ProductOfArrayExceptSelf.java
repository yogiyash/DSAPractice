package neetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    
    public static void main(String[] args) {
        int arr [ ]  = new int [] {1,2,3,4};
        int arr2 [ ] = new int [] {-1,0,-1,3};

       System.out.println(Arrays.toString(productExceptSelf(arr)));
       System.out.println(Arrays.toString(productExceptSelf(arr2)));
        

    }
   
        public static int[]  productExceptSelf(int[] nums) {
            int numsLength = nums.length;
            int prefixProduct = 1;
            int suffixProduct = 1;
            int[] result = new int[numsLength];
            for(int i = 0; i < numsLength; i++) {
                result[i] = prefixProduct;
                prefixProduct *= nums[i];
            }
            for(int i = numsLength-1; i >= 0; i--) {
                result[i] *= suffixProduct;
                suffixProduct *= nums[i];
            }
            Arrays.sort(result);
            return result;
        }
    

}
