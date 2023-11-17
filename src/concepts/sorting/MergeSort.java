package concepts.sorting;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = new int [] {-1, 2,-3,-1,4,-2,7,1,6,0};

    }

    static void mergesort(int a [], int left, int right){



    }
    static int partition(int arr[], int left, int right){

        if(left<right){
            int mid = (left +right)/2;

            int l = partition(arr, left,mid-1 );
            int r = partition(arr, mid, right);

            if(arr[l]>arr[r]){
                
                int temp = arr[l];


            }

        }



    }
    
}
