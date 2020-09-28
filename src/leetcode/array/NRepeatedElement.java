package leetcode.array;

import java.util.HashMap;

/**
 * Array of len 2N there are N+1 unique element an exactly one  element is repeated N times
 * return element repeated N times
 */
public class NRepeatedElement {

    public static void main(String[] args) {

    }

    static int repeatedElemet(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        // initialize with random;
        int result =arr[0];
        for(int i:arr){
            Integer num = map.get(i);
            if(num == null){
                map.put(i,1);
            }else if(num==1){
                result =i;
            }
        }
        return  result;
    }

}
