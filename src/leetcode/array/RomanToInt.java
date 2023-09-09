package leetcode.array;

import java.util.HashMap;

public class RomanToInt {
    



    public int romanToInt(String s) {


        char[] arr = s.toCharArray();
        
        int index = 0;
        int len = arr.length;
        
        HashMap<Character,Integer> scalemap =  new HashMap<>(),charmap = new HashMap<>();
        charmap.put('I',1);
        charmap.put('V',5);
        charmap.put('X',10);
        charmap.put('L',50);
        charmap.put('C',100);
        charmap.put('D',500);
        charmap.put('M',1000);

        scalemap.put('I',1);
        scalemap.put('V',1);
        scalemap.put('X',10);
        scalemap.put('L',10);
        scalemap.put('C',100);
        scalemap.put('D',100);
        scalemap.put('M',1000);
        

        // starts with an m 

        int total = 0;

        // detemine place scale

        int last = 0 ; 
       int i = 0;

        if ( len  == 1 ){
            return charmap.get(arr[i]);
        }else {

        while(i < len-1 ){

        if (charmap.get(arr[i])<charmap.get(arr[i+1])){
            //backword case
            int sum = charmap.get(arr[i+1]);
            sum -= charmap.get(arr[i]);
            total+=sum ;
            i+=2;
        }else{
            int j = i;
            int k = j+1; 
            while (charmap.get(arr[j]) >= charmap.get(arr[k])){
                j++;
            }
                //MMMDCXLVII      MMMDXXXIII
            if (k>j+1){
                //depleted series

            }else{
                total+= charmap.get(arr[i]);
            }
            


        }    
        

     


        
    }

}
