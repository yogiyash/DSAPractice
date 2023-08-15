package leetcode.array;

import java.util.*;


public class maxArrayLenforSumk {

    class range {
        int start;
        int end;
        int len;

        range(int start,int end){
            this.start =start;
            this.end = end;
            this.len = end-start;
        }

    }

    public int maxSubLen(int[] array,int constSum){
        int max = 0;
        
        List<range> list =  new ArrayList<range>();
        
        for (int i=0;i< array.length;i++){
            int sum =0;
            int currentLen = -1;
            int start = 0 ;
            int end = 0 ;
            
            for (int j = i; j< array.length;j++){
                
                if (sum == constSum){
                    int len  = end - start;
                    list.add(new range(start,end));

                    break;   
                }

                
                


            }
        }




        return max;


    }
    
}
/*
 * If you respect that person
 * actual value that 
 * novelity is gone //newness t
 * you are still with that person 
 * 
 * Generic 
 * 
 * 
 * 
 * 
 */
