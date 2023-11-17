package concepts.recursion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BiCounter {

    public static void main(String[] args) {
        List<Integer> list  = IntStream.range(1, 11).mapToObj(Integer::valueOf).
         collect(Collectors.toList());
        Integer arr[] = new Integer[10];
        list.toArray(arr);
        new BiCounter().bytepicker(arr, 0, arr.length-1);
        
    
    }

    void bytepicker(Integer[] a, int left, int right){

        if(left>=right)
            return;
        int mid = (left+right)/2;

        System.out.println(a[mid]);

        bytepicker(a, left, mid-1);
        bytepicker(a, mid+1, right);


    }

}
