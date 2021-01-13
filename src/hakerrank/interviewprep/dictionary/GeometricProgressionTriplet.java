//package hakerrank.interviewprep.dictionary;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//
//public class GeometricProgressionTriplet {
//
//    public static void main(String[] args) {
//        System.out.println(hashingReverse(Arrays.asList(new Long[]{1l,2l,2l,4l}),2));
//    }
//
//    static long bruteforce(List <Long> arr, long r) {
//
//
//            int len = arr.size();
//            long count =0;
//            for(int i =0;i<len-2;i++){
//                for(int j = i+1;j<len-1;j++){
//                    if(arr.get(j)/arr.get(i)==r){
//                        for(int k=j+1;k<len;k++){
//                            if(arr.get(k)/arr.get(j)==r){
//                                count++;
//                            }
//
//                        }
//                    }
//                }
//            }
//
//
//            return count;
//
//        }
//
//
//        static long hashing(List<Long>arr,long r){
//            HashMap <Long ,List<Integer>> posMap = new HashMap<>();
//           int pos =0;
//           int len = arr.size();
//            for(long item:arr){
//                List<Integer> posarray = posMap.get(item);
//                if(posarray == null)
//                    posarray = new ArrayList<>();
//
//                posarray.add(pos++);
//                posMap.put(item,posarray);
//            }
//
//            long count =0;
//            for (int i =0;i<len-2;i++){
//                long b = arr.get(i)*r;
//                List<Integer> b_pos = posMap.get(b);
//                if(b_pos!=null){
//                    long c = b*r;
//                    List<Integer> c_pos = posMap.get(c);
//                    if(c_pos!=null)
//                    for(Integer position:b_pos){
//                        if(position>i){
//                            for(Integer lastpostion:c_pos){
//                                if(lastpostion>position){
//                                    count++;
//                                }
//                            }
//                        }
//                    }
//
//                }
//
//
//            }
//
//
//
//        return count;
//
//        }
//
//        //reversed
//    // Complete the countTriplets function below.
//    static long hashingReverse(List<Long> arr, long r) {
//
//
//
//        HashMap <Long ,List<Integer>> posMap = new HashMap<>();
//        int pos =0;
//        int len = arr.size();
//        for(long item:arr){
//            List<Integer> posarray = posMap.get(item);
//            if(posarray == null)
//                posarray = new ArrayList<>();
//
//            posarray.add(pos++);
//            posMap.put(item,posarray);
//        }
//
//        long count =0;
//        for (int i =0;i<len-2;i++){
//            long b = arr.get(i)*r;
//            List<Integer> b_pos = posMap.get(b);
//            if(b_pos!=null){
//                long c = b*r;
//                List<Integer> c_pos = posMap.get(c);
//
//                if(c_pos!=null){
//                    int b_len = b_pos.size();
//                    for(int bi=b_len-1;bi>=0;bi--){
//                        if(b_pos.get(bi)<i){
//                            break;
//                        }
//                        int c_len = c_pos.size();
//                        for(int ci=c_len-1;ci>=0;ci--){
//                            if(c_pos.get(ci)<b_pos.get(bi))
//                                break;
//                            else{
//                                count++;
//                            }
//
//
//                        }
//
//
//                    }
//
//                }
//
//
//
//
//            }
//        }
//
//
//        return count;
//
//
//
//    }
//
////
////
//
//
//    static long threepointer (List<Long> arr, long r) {
//
//        int i = 0;
//        int j =1;
//        int k = 2;
//        int len = arr.size();
//        while (c<len){
//
//            int a =arr.get(i),b=arr.get(j),c=arr.get(k);
//
//            if(a*r==b){
//                if(b*r==c){
//                    count++;
//
//
//                }  else if(b*r>c){
//                    // move c
//                    k++;
//
//                }else{
//                    //b*r<c
//                    //move b
//                    if(k==j+1){
//                        //move c as well
//                        k++;
//
//                    }
//                    j++;
//                }
//
//
//            }   else if(a*r<b)
//            {
//                // move forward
//
//
//
//            }
//
//
//        }
//
//
//
//
//    }
//
//
//
//}
//
//}
