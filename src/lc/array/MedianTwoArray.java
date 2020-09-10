package lc.array;


/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * Follow up: The overall run time complexity should be O(log (m+n)).
 */
public class MedianTwoArray {


    public static void main(String[] args) {
       //int  nums1[] = new int[]{ 1,3}, nums2[] = new int[]{2};
        int  nums1[] = new int[]{ -2,-1}, nums2[] = new int[]{3};
       // System.out.println(findMedianSortedArrays(nums1,nums2));

        merger(nums1,nums2);


    }

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] merged = merger(nums1,nums2);
            return median(merged);
        }

        static int[] merger(int num1[],int num2[]){
            int len1 = num1.length;
            int len2 = num2.length;
            int len3 = len1+len2;
            int merged[] = new int[len3];
            int pointer1=0, pointer2=0,pointer3=0;
            while(pointer3<len3){
                if(pointer1<len1 && pointer2 < len2){
                    // both array remaining
                    merged[pointer3++]=num1[pointer1]<num2[pointer2]?num1[pointer1++]:num2[pointer2++];
                }
                else{
                    // one array remaining // use compl
                    if(pointer1<len1){
                        //fill first array
                        while(pointer3<len3){
                            merged[pointer3++]=num1[pointer1++]   ;
                        }
                    }else{
                        // fill second array
                        while(pointer3<len3){
                            merged[pointer3++]=num2[pointer2++]   ;
                        }
                    }
                }
            }
            return merged;
        }

        static double median(int [] arr){
            int len = arr.length;
            if(len ==0 )
                return 0d;
            if(isEven(len)){
                len--;
                return (arr[len/2]+arr[len/2+1])/2.0d;
            }else
                return arr[(len-1)/2];
        }

        static boolean isEven(int num){
            return num%2==0;
        }
}
