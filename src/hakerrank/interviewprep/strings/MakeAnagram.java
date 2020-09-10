/*
package hakerrank.interviewprep.strings;

import java.util.HashMap;

*/
/**
 *
 *//*

public class MakeAnagram {

    static int makeAnagram(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();




        int delete =0;
        for(int i=0;i<len1;i++){
            boolean found = false ;
            for(int j =0;j<len2;j++){
             if (arr1[i]==arr2[j])
             {found=true;break;}
            }
            if(!found){
                // no record found
                delete++;
                


            }
        }

        for(char c:arr1){
            Integer present = amap.get(c)
            int val = (present==null)?1:++present;
            amap.put(c,val);
        }

        for(char c: arr2){
            Integer present = bmap.get(c);
            int val = (present==null)?1:++present;
            bmap.put(c,val);
        }

        int delete = 0 ;
        amap.keySet().forEach(c->{
            Integer count = bmap.get(k);
            if(count==null){

                delete+=amap.remove(k);


            }else{
               count
            }
        });


        })


}
*/
