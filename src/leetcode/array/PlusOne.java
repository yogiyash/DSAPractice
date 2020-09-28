package leetcode.array;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int len = digits.length;
        int pos = len - 1;
        int carried = 1;
        while (carried > 0 && pos > -1) {
            int sum = digits[pos] + carried;
            if (sum > 9) {
                digits[pos] = sum % 10;
                carried = 1;
            } else {
                digits[pos] = sum;
                carried = 0;
                break;
            }
            pos--;
        }

        if (carried > 0) {
            int[] arr = new int[len + 1];
            arr[0] = carried;
            int newpos = 1;
            for (int i : digits) {
                arr[newpos++] = i;
            }
            return arr;

        }

        return digits;

    }
}
