package leetcode.array;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric
 *  characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 */

class Palindrome {

    public boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    public boolean isalphabet(char c) {
        return c >= 'a' && c <= 'z';
    }

    public boolean isAlpaNumberic(char c){
        return (c >= 'a' && c <= 'z') || (c>='0' && c<='9');
    }

    public boolean isPalindromePhrase(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int len = s.length();
        if (len < 2)
            return true;
        
        int head = 0, tail = len - 1;

        while (head < tail) {
            if (!isAlpaNumberic(chars[head])) {
                head++;
                continue;
            }
            if (!isAlpaNumberic(chars[tail])) {
                tail--;
                continue;
            }
            if (chars[head] != chars[tail]) {
                return false;
            } else {
                head++;
                tail--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindromePhrase("0P"));
        System.out.println(obj.isPalindromePhrase("A man, a plan, a canal: Panama"));

    }

}