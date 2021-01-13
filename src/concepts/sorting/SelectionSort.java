package concepts.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[]= new int [] {64,25,12,22,11};
        sort(arr);

    }

    static void sort(int arr[]){
        int len = arr.length;

        for(int i=0;i<len-1;i++){

            int min_index = i;
            for(int j=i+1;j<len;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }

                }

            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]= temp;

            System.out.println("pass"+i);
            for(int y:arr){
                System.out.print(y+" ");
            }
            System.out.println();


        }

    }
}
