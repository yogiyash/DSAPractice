package leetcode.jan;

import java.util.HashMap;
import java.util.HashSet;

/*
//    Input: n = 2
//    Output: 2
//    Explanation:
//    The first beautiful arrangement is [1,2]:
//            - perm[1] = 1 is divisible by i = 1
//            - perm[2] = 2 is divisible by i = 2
//    The second beautiful arrangement is [2,1]:
//            - perm[1] = 2 is divisible by i = 1
//            - i = 2 is divisible by perm[2] = 1
 */
public class BeautifulArrangement {


    public int countArrangement(int n) {

        return helper(1,new HashSet<>(),n,new HashMap<>());


    }


    public int helper(int pos,HashSet<Integer> occured,int n,HashMap<String,Boolean> computed)


    {

        int sum =0;
        for(int i=1;i<=n;i++){


            // if this number has not occured
            if(!occured.contains(i) ){


                //memorization
                if(computed.get(pos+"/"+i) == null){
                    computed.put(pos+"/"+i,pos%i==0);
                }
                if(computed.get(i+"/"+pos) == null){
                    computed.put(i+"/"+pos,i%pos==0);
                }

                //if the condition is true
                if(computed.get(pos+"/"+i)||computed.get(i+"/"+pos))
                {


                    if(pos == n){

                        return 1;
                    }else{


                        HashSet<Integer> new_occured = new HashSet<>();
                        new_occured.addAll(occured);
                        new_occured.add(i);

                        sum += helper(pos+1,new_occured,n,computed);
                    }
                }
            }

        }


        return sum;

    }
}


