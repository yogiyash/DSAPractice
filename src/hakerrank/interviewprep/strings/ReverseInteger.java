package hakerrank.interviewprep.strings;

public class ReverseInteger {

    public static void main(String[] args) {
        Integer str = 123;

        System.out.println(reverse(str));
    }


    public static int reverse(int x) {
        String str = "" + x;

        boolean minus = str.charAt(0) == '-';

        if (minus)
            str = str.substring(1);

        char[] chars = str.toCharArray();

        int len = chars.length;

        int half = len / 2;

        char temp;
        for (int i = 0; i < half; i++) {
            temp = chars[len - 1 - i];
            chars[len - 1 - i] = chars[i];
            chars[i] = temp;
        }

        if (minus)
            str = "-";
        else
            str = "";

        for (int i = 0; i < len; i++) {
            str = str + chars[i];
        }

        return Integer.parseInt(str);


    }


}
