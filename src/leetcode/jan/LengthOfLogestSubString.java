package leetcode.jan;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLogestSubString {

// this is a dp problem
    public static void main(String[] args) {

        //pkfewww
        System.out.println(new LengthOfLogestSubString().method("aab"));

    }



    public int method(String s) {

        char [] chars = s.toCharArray();

        int len = s.length();
        int max = 0;
        int sublen = 0;

        Set<Character> set = new HashSet<Character>();
        boolean all =true;
        for (int i =0; i<len; i++){

            char c = chars[i];

            if(set.contains(c)){
                all = false;
                max = sublen>max?sublen:max;
                sublen = 0;
                set.clear();
                i--;

            }else{
                sublen++;
                set.add(c);

            }
        }

        max = sublen>max?sublen:max;
        return all?len:max;
    }
}
