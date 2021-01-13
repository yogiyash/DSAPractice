package other;

import java.util.HashMap;

public class CommonCharacters{

    /**
     * O (n^2)
     * @param a
     * @param b
     * @return
     */

     public static void main(String[] args) {
         

        CommonCharacters obj = new CommonCharacters();
        System.out.println(obj.commons("abcd","daad"));
        System.out.println(obj.commonsOpt("abcde","daade"));


     }
    
    String commons(String a, String b ){

        char[] arr_a = a.toCharArray();
        char[] arr_b = b.toCharArray();

        char [] common = new char[arr_a.length];
        int index = 0;
        for(char c :arr_a ){
            boolean found = false;
            for(char d : arr_b){
                if(c==d){
                    found = true;
                    break;
                }
            }

            if(found){
                common[index++] =  c;
            }
        }

        return new String(common);

    }


    /**
     * O(n)
     * @param a
     * @param b
     * @return
     */
    String commonsOpt (String a ,String b){

        char[] arr_a = a.toCharArray();
        char[] arr_b = b.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c :arr_a ){
            Integer freq = map.get(c);
            if(freq==null)
                freq=1;
            else freq +=1;
            map.put(c,freq);     
        }

        int index=0;
        char [] common= new char[arr_a.length];
        for(char c:arr_b){
            Integer freq = map.get(c);
            if(freq!=null){
                common[index++]=c;
                if(freq==1)
                    map.remove(c);
                else{
                    map.put(c,freq-1);
                }    
            }
        }
        return new String(common);

    }





}