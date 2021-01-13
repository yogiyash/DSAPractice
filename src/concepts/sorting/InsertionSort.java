package concepts.sorting;

import utility.array.ArraysHelper;

/**
 * Best for small dataset// more efficient than N^2  algo like BubbleSort and SelectionSort
 * for large data set See Quick, Heap Sort And Merge
 * <p>
 * efficient for dataset that are already substantially sorted
 * Only requires O(1) extra memory space
 * Online can sort list as  it receives it
 *
 * works as you would sort cards in hands
 *
 */

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        //int arr[] = new int[]{3, 4, 2, 10, 12, 1, 5, 6};
        new InsertionSort().sort(arr);



    }


    public void sort(int arr[]) {

        int len = arr.length;
        int sorted = 0;

        int temp =0;
        while (sorted < len) {
            boolean swap= false;
            for (int i = 0; i < sorted; i++) {
                if (arr[i] > arr[sorted] ) {
                    swap=true;
                    temp = arr[sorted];
                    //shift elements right
                    for(int j =sorted;j>i;j--){
                    arr[j] = arr[j-1];
                    }
                    arr[i]=temp;
                }
            }

            System.out.println(String.format("\npass:%d\n",(sorted+1)));
            if(swap)
            ArraysHelper.printArray(arr);
            else
                System.out.println("no moves");
            sorted++;
        }


    }

    public void sortgfg(int arr[]){
            int len = arr.length;
            for(int i=1;i<len;i++){
                int key = arr[i];
                int j = i-1;
                while( j>=0 &&  arr[j]>key){

                }

            }

    }
}