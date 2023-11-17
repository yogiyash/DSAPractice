package concepts.search;

import java.util.Arrays;

public class ModifiedBinarySearch {
    //find the closes last element in case element not found

    public static void main(String[] args) {
        int arr[] = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(sortedTwoSum(arr, 9)));
        
        
        
    }

    public static int [] sortedTwoSum(int numbers[], int target ){

        int len = numbers.length;
        int result[] = new int[2];

        for(int i=0; i<len-1;i++){
        
            int second = bsearch(numbers, i+1, len-1, target-numbers[i]);
            if(second>0){
                result[0] = i+1;
                result[1]=second+1;
                break;
            }
        }
        return result;

    }

    //search index for target;
    private static int bsearch(int arr[],int l, int r, int target){
            
     
        if(l<=r){
         int mid = (l+r)/2;
         if(arr[mid] == target)
            return mid;
         else if(arr[mid]>target){
            return bsearch(arr, l, mid-1, target);
         }else{
            return bsearch(arr, mid+1, r, target);
         }

        }
        return -1;  
}
}