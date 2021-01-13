package hakerrank.interviewprep.strings;

/**
 * Given a string,Reverse all the vowels in a string
 */
public class ReverseVowels {

    static String reverse(String input) {
        char[] chars = input.toCharArray();
        int len = chars.length;
        int left = 0, right = len - 1;
        while (left < right) {
            boolean leftfull = isVowel(chars[left]);
            boolean rightfull = isVowel(chars[right]);
            if (leftfull && rightfull) {

                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;

            } else if (leftfull) {
                right--;
            } else {
                left++;
            }
        }
        return new String(chars);
    }

    static boolean isVowel(char in) {
        return in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u';

    }

    public static void main(String[] args) {
        String input1 = "apple";
        String input2 = "friends";
        System.out.println(reverse(input1));
        System.out.println(reverse(input2));
    }

}
