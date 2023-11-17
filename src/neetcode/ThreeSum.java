package neetcode;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int arr  []  = new int[]{-1,0,1,2,-1,4};
        System.out.println(String.valueOf(new ThreeSum().threeSum(arr)));
    }

    public  ArrayList<Integer> addinorder(int a,int b, int c){
        ArrayList<Integer> list = new ArrayList<>();
              if(a <= c && a <= b ){
                            list.add(a);
                            if(c<=b){
                                list.add(c);
                                list.add(b);
                            }else{
                                list.add(b);
                                list.add(c);

                            }
                        } else if(c<=a && c<=b){
                            list.add(c);
                            if(a<=b){
                                list.add(a);
                                list.add(b);
                            }else{
                                list.add(b);
                                list.add(a);
                            }
                        }else{
                            list.add(b);
                            if(a<=c){
                                list.add(a);
                                list.add(c);
                            }else{
                                list.add(c);
                                list.add(a);
                            }
                        }
                    return list;

    }

    public  List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
         Set<List<Integer>> unique = new HashSet<>();

        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int target = 0 - nums[i];

            HashMap<Integer, Integer> map = new HashMap<>();
           
            if(i==3){
                System.out.println();
            }

            for (int j = 0; j < len; j++) {
                if (j != i) {
                    int diff = target - nums[j];
                    if (map.get(diff) != null) {
                        List<Integer> triplet = addinorder(nums[i], diff,nums[j]);
                        if (unique.add(triplet)) {
                            result.add(triplet);
                        }
                    }else{
                        map.put(nums[j],j);
                    }
                }
            }

        }

        return result;
    }

}
