package hakerrank.interviewprep.arrays;

/**
 * It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by from at the front of the line to
 * <p>
 * at the back.
 * <p>
 * Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if
 * and bribes , the queue will look like this:
 * <p>
 * .
 * <p>
 * Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!
 * <p>
 * Print an integer denoting the minimum number of bribes needed to get the queue into its final state. Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than people.
 * 2 1 5 3 4
 * 2 5 1 3 4
 * output
 * 3
 * Too chaotic
 */
public class NewYearChaos {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 5, 3, 4};
        int[] arr1 = new int[]{2, 5, 1, 3, 4};
        int[] arr2 = new int[]{1, 2, 5, 3, 7, 8, 6, 4};
//
//        1 2 3 4 5 6 7 8
//        1 2 5 4 3 6 7 8 // 2
//        1 2 5 8 3 6 7 4 // 4
//        1 2 5 8 3 7 6 4 // 1
//
//
//
//
//
//
//
//
//
//
//        1 2 5 3 4 6 7 8 //2  // 2
//        1 2 5 3 6 4 7 8 //1
//        1 2 5 3 7 6 4 8 //2
//        1 2 5 3 7 8 6 4 //2 // 2 + 2
//        // 1 + 4 + 1
//
//        //+1 +4  -2 + 1 -2 -2
        minimumBribes(arr);
        minimumBribes(arr1);
        minimumBribes(arr2);

    }

    static void minimumBribes(int[] q) {

        int len = q.length;
        int bribes = 0;
        for (int i = 1; i <= len; i++) {
            if (q[i - 1] > i) {
                int diff = q[i - 1] - i;
                if (diff > 2) {
                    System.out.println("Too chaotic");
                    return;
                } else {
                    bribes += diff;
                }
            }
        }
        System.out.println(bribes);
    }


}
