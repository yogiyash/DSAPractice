package hakerrank.onlinetest;

public class OnlineTest90Minutues {


    public static void main(String[] args) {

        decryptPassword("51Pa*0Lp*0e");

    }


    static boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    static boolean isUpperCase(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String decryptPassword(String s) {
        // Write your code here
        char[] chars = s.toCharArray();
        int len = chars.length;


        if (len == 1)
            return s;


        int numspointer = 0;

        StringBuilder decrypter = new StringBuilder();

        int i = len - 1;
        int upto = 0;
        while (i >= numspointer) {


            if (i > 2 && chars[i] == '*' && isLowerCase(chars[i - 1]) && isUpperCase(chars[i - 2])) {
                decrypter.append(chars[i - 2]).append(chars[i - 1]);
                i -= 3;
                len -= 1;

            } else if (i > 0 && chars[i] == '0') {
                decrypter.append(chars[numspointer++]);
                i--;
                len -= 1;
            } else {
                decrypter.append(chars[i]);
                i--;
            }
        }

        String desc = decrypter.toString();
        decrypter.setLength(0);
        chars = desc.toCharArray();

        for (i = len - 1; i >= 0; i++) {
            decrypter.append(chars[i]);
        }
        return decrypter.toString();


    }


}



