package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagram {

    private final static int charcode = (int) 'a';

    private static String calculateAnahash(String value) {

        // calculate hash
        int arr[] = new int[26];
        int len = value.length();
        for (int i = 0; i < len; i++) {
            int pos = value.charAt(i) - 'a';
            arr[pos]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j).append('$');
        }
        return sb.toString();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
            //create a map
            Map<String, List<String>> map  = new HashMap<>();
            for (String str: strs){
                String hash = calculateAnahash(str);
                List<String> list = map.get(hash);
                
                if(list == null)
                { 
                    list = new ArrayList<String>();
                }
                list.add(str);
                map.put(hash,list);
            }

            
            final List<List<String>> result = new ArrayList<>();

            for(String e : map.keySet()){
                result.add(map.get(e));
            }
            return result;
    }

    public static void main(String[] args) {

        String[] arr = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<String> list = Stream.of(arr).collect(Collectors.toList());
        List<List<String>> suer = groupAnagrams(arr);

        suer.forEach(l -> {
            l.forEach(System.out::println);
            System.out.println();
        });

    }
}
