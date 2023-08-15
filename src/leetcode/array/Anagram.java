package leetcode.array;

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        boolean isAnagram = true;
        if ( len1 != len2 )
        return false;


        else {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            //populate map
            for (int i = 0 ;i<len1; i++){
                char c = s.charAt(i);
                if(map.get(c)==null){
                    map.put(c,1);
                }else{
                    map.put(c,map.get(c)+1);
                }
            }
            map.forEach((c,v)->{
                System.out.printf("%s:%s\n",c,v);
            });
            //depopulate map
              for (int i = 0 ;i<len2; i++){
                char c = t.charAt(i);
                if(map.get(c)==null){
                    //new character found\
                    System.out.println("new char found return false");
                    return false;
                }else if(map.get(c)==1){
                    System.out.println("empty map for "+c);
                    map.remove(c);
                }else{
                    System.out.println("subtact for "+c);
                     map.put(c,map.get(c)-1);
                }
            }
            isAnagram = map.size()==0;
        }
        return isAnagram;
    
}

public static void main(String[] args) {
    String s1 = "rat",s2 = "car";
    System.out.println(isAnagram(s1, s2));
    
    
}

}
