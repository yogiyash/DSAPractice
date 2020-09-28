package concepts.recursion;

/**
 * Fibonacci using recursion
 */

public class Fibonacci {


    public static void main(String[] args) {
        new Fibonacci().printSeriesUptolen(5);


    }

    void printSeriesUptolen(int len) {
        if (len < 0) {
            return;
        }
        if (len == 1) {
            System.out.print("1");
            return;
        }
        System.out.print("1 1 ");
        series(len - 2, 1, 1);
    }


    void series(int len, int first, int second) {

        if (len == 0)
            return;
        int temp = first;
        first = second;
        second = second + temp;
        System.out.print(second + " ");
        series(--len, first, second);
    }


}
