package hakerrank.onlinetest;

import java.util.ArrayList;
import java.util.List;

public class
Test2 {

    public static void main(String[] args) {

        String str = "dfwhsshwfdfadafqrgigrq";
        str = "fyffasdasdfddddddddnejivojiopqwbbwqpoijovijen";
        List<String> lits = threePalindromicSubstrings(str);
        for (String lit : lits) {
            System.out.println(lit);
        }


    }


    static boolean isPalidrome(int start, int end, char[] arr) {

        int len = end - start + 1;
        boolean isPalidrome = true;
        for (int i = 0; i < len / 2; i++) {
            if (arr[start + i] != arr[end - i]) {
                isPalidrome = false;
                break;
            }
        }

        return isPalidrome;

    }

    public static List<String> threePalindromicSubstrings(String word) {

        List<String> subStrings = new ArrayList<>();


        char[] array = word.toCharArray();
        //special cases;

        int len = array.length;

        if (len < 3) {
            subStrings.add("Impossible");
            return subStrings;
        }

        if (len == 3) {
            subStrings.add("" + array[0]);
            subStrings.add("" + array[1]);
            subStrings.add("" + array[2]);

            return subStrings;
        }

        for (int i = 0; i < len; i++) {

            for (int j = i + 1; j < len; j++) {
                if (array[i] == array[j]) {
                    if (isPalidrome(i, j, array)) {
                        subStrings.add(word.substring(i, j + 1));
                        i = j;
                        break;
                    }
                }
            }
        }

        if (subStrings.size() != 3) {
            subStrings = new ArrayList<>();
            subStrings.add("Impossible");
        }

        return subStrings;


    }


}
