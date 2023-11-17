package algoexpert;

public class ArrayContainsSubsequence {

    public static void main(String[] args) {
        int main [] = new int [] {1,2,4,8,4,8,5,7,4};
        int sub [] = new int[] {4};
        System.out.println(contains(main,sub));
    }

    public static int contains(int[] main, int[] sub) {
        int location  = -1;
        int main_len = main.length;
        int sub_len = sub.length;

        if (main_len < sub_len || sub_len == 0)
            return location;

        int pointer = 0;
        while (pointer <= main_len - sub_len) {
            int spointer = 0;
            int temp = pointer;
            while ( spointer < sub_len && main[temp] == sub[spointer] ) {
                temp++;
                spointer++;
            }
            if (temp-pointer == sub_len) {
                return pointer;
                
            }
            pointer++;

        }
        return -1;

    }

}
