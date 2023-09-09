package concepts.sorting;

import java.util.Arrays;

public class QuickSort {
    

    public static void qsort(int []arr, int l, int r){
        
        
        
        int i = l-1;
        int j = l;
        while(j < r-1){
            if (arr[j]<=arr[r]){
                i++;
                int temp = arr [i];
                arr[i] =  arr [j];
                arr[j] = temp;     
            }
           j++;
        }
        
        int temp  = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] =  temp;

        



    }

    public static void main(String[] args) {

        int arr[] = new int [] {-1, 2,-3,-1,4,-2,7,1,6,0};
        qsort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);

    }
}
