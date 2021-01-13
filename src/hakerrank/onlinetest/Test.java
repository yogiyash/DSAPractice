package hakerrank.onlinetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> cap = new ArrayList<>();


        //answer should be  68 or close
        //our is 105, WE FAILED BECAUSE OF ORDER
        Integer[] usedArray = new Integer[]{154, 684, 48, 608, 774, 523, 306, 777, 454, 25, 631, 367, 601, 445, 171, 686, 617, 299, 156, 334, 358, 577, 379, 667, 158, 112, 679, 615, 420, 538, 734, 592, 521, 763, 234, 198, 32, 189, 590, 474, 478, 505, 159, 401, 455, 161, 516, 348, 681, 531, 356, 147, 308, 439, 1, 127, 236, 458, 314, 515, 794, 561, 755, 419, 558, 186, 130, 216, 564, 503, 118, 244, 220, 568, 548, 470, 196, 104, 474, 704, 549, 386, 59, 260, 607, 331, 625, 333, 174, 404, 498, 721, 751, 32, 481, 204, 301, 521, 134, 459, 204, 277, 151, 735, 381, 680, 233, 175, 750, 143, 650, 772, 711, 680, 184, 371};
        Integer[] capacityArray = new Integer[]{41, 724, 651, 972, 230, 319, 747, 300, 231, 622, 777, 125, 245, 959, 697, 772, 65, 561, 599, 752, 941, 504, 552, 802, 206, 81, 419, 275, 650, 414, 321, 26, 13, 784, 789, 118, 9, 551, 325, 196, 258, 512, 691, 667, 411, 594, 554, 566, 961, 743, 404, 353, 308, 142, 911, 201, 800, 128, 172, 788, 415, 626, 642, 518, 349, 843, 316, 975, 446, 374, 221, 912, 240, 55, 306, 930, 254, 190, 167, 357, 305, 861, 899, 593, 721, 117, 581, 868, 353, 940, 699, 902, 812, 617, 892, 672, 729, 672, 662, 46, 121, 241, 159, 454, 628, 351, 712, 564, 595, 534, 728, 828, 796, 532, 443, 517};
        Test hackerrank = new Test();

        System.out.println(hackerrank.minPartitions(Arrays.asList(usedArray), Arrays.asList(capacityArray)));
    }


    /**
     * This method accepts List of used partition space and partitions capacity list
     *
     * @param used
     * @param totalCapacity
     * @return
     */
    public int minPartitions(List<Integer> used, List<Integer> totalCapacity) {


        //to calculate total used space sum all used
        Integer totaldata = used.stream().reduce(0, (i, j) -> i + j);

        //create partitions list
        LinkedNode partitions = new LinkedNode(true);
        totalCapacity.stream().forEach(partitions::add);

        return partitions.calculateRequiredPartition(totaldata);

    }

    //consolidating  partition
}// three palidromic string

class LinkedNode {
    int val;
    int freq;
    boolean isRoot;
    private LinkedNode next;


    public LinkedNode(int val, int freq) {
        this.val = val;
        this.freq = freq;
    }

    public LinkedNode(boolean isRoot) {
        this(-1, -1);
        this.isRoot = true;

    }

    public int calculateRequiredPartition(int dataSize) throws RuntimeException {

        if (!isRoot)
            throw new RuntimeException("not a root node");

        LinkedNode pointer = this;
        int usedPartition = 0;
        while (dataSize > 0 && pointer != null) {
            if (!pointer.isRoot) {
                for (int i = 0; i < pointer.freq; i++) {
                    dataSize -= pointer.val;
                    usedPartition++;
                    if (dataSize < 1) {
                        break;
                    }
                }
            }
            pointer = pointer.next;
        }
        if (dataSize > 0)
            throw new RuntimeException("Out of Memory");
        return usedPartition;
    }

    public void print() {
        LinkedNode node = this;
        do {
            if (!node.isRoot)
                System.out.println(node.val + ":" + node.freq);
            node = node.next;
        } while (node != null);
    }


    public void add(int val) {
        LinkedNode pointer = this;
        LinkedNode last = this;
        boolean consumed = false;
        do {

            // is head
            if (pointer.isRoot) {
                //first item
                if (Objects.isNull(pointer.next)) {
                    pointer.next = new LinkedNode(val, 1);
                    consumed = true;
                    break;
                }
                // traverse next
                pointer = pointer.next;
                continue;
            }

            //if node with same value exists, Increment frequency and exit
            if (pointer.val == val) {
                pointer.freq++;
                consumed = true;
                break;
            } else if (val > pointer.val) {
                // no partition for this value, create new one
                LinkedNode node = new LinkedNode(val, 1);
                node.next = pointer;
                last.next = node;
                consumed = true;
                break;

            } else {
                //value is smaller pointer value
                last = pointer;
                pointer = pointer.next;
            }

        }
        while (pointer != null);
        if (!consumed) {
            // new smallest partition found,create new
            last.next = new LinkedNode(val, 1);
        }
    }
}


