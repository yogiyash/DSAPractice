package concepts.recursion;

import java.util.Objects;

public class TowerofHanoiDemo {

    /**
     * Lets create a TowerofHanoi with src tower carrying weight in ascending order
     * A->1->2->3->4->5
     *
     * @param args
     */
    public static void main(String[] args) {

        TowerNode head = new TowerNode(1);
        TowerNode sec = new TowerNode(2);
        TowerNode third = new TowerNode(3);
//        TowerNode four = new TowerNode(4);
//        TowerNode five = new TowerNode(5);

        // link all nodes in ascending order
//        four.next=five;
//        third.next =four;
        sec.next = third;
        head.next = sec;


        // instantiate a threeTower container
        ThreeTowers threeTowers = new ThreeTowers(head);

        //call the shift function
        System.out.println(threeTowers);
        int shifts = threeTowers.shiftTower(0, null, null);
        System.out.println(threeTowers);
        System.out.println(shifts);


    }


}

class TowerNode {
    int val;
    TowerNode next;

    TowerNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TowerNode{");
        TowerNode node = this;
        do {
            builder.append(node.val + ",");
            node = node.next;
        }
        while (node != null);

        if (builder.length() > "TowerNode{".length()) {
            builder.setLength(builder.length() - 1);
        }
        builder.append("}");
        return builder.toString();
    }

}


class ThreeTowers {
    /**
     * lets say at starts a is source
     * but we will write a function that take src as param :?
     */
    TowerNode A;
    TowerNode B;
    TowerNode C;


    /**
     * Let say for now we only pass tower A and both other are empty
     *
     * @param A
     */
    ThreeTowers(TowerNode A) {
        Objects.requireNonNull(A);
        this.A = A;
    }

    /**
     * h       b
     * A 1 2 3 4 5
     * B
     * C
     * <p>
     * A 2 3 4 5
     * hb
     * B 1
     * C
     * <p>
     * A 3 4 5
     * hb
     * B 1
     * hb
     * C 2
     * <p>
     * A 3 4 5
     * h b
     * B 1 2
     * C
     * <p>
     * <p>
     * <p>
     * moves the Tower to another Tower and return number of shifts
     *
     * @return
     */
    int shiftTower(int count, TowerNode b_base, TowerNode c_base) {

        if (A != null) {
            if (B == null) {//put node in B
                TowerNode plucked = A;
                A = A.next;
                plucked.next = null;
                B = b_base = plucked;
                return shiftTower(++count, b_base, c_base);
            } else if (C == null) {
                TowerNode plucked = A;
                A = A.next;
                plucked.next = null;
                C = c_base = plucked;
                return shiftTower(++count, b_base, c_base);
            } else {
                //both b and c tower has nodes
                if (B.val > A.val) {
                    // a node can be placed on top of b
                    TowerNode plucked = A;
                    A = A.next;
                    plucked.next = B;
                    B = plucked;
                    return shiftTower(++count, b_base, c_base);
                } else if (C.val > A.val) {
                    // a node can be placed on top of c
                    TowerNode plucked = A;
                    A = A.next;
                    plucked.next = C;
                    C = plucked;
                    return shiftTower(++count, b_base, c_base);
                } else {
                    // a node cannot be placed on top of  a or b // we must empty one of the tower for fresh entry
                    if (b_base.val < C.val) {
                        // b can be placed on top of c
                        b_base.next = C;
                        C = B;
                        // now put node in tower b
                        TowerNode plucked = A;
                        A = A.next;
                        plucked.next = null;
                        b_base = B = plucked;

                        return shiftTower(++count, b_base, c_base);

                    } else if (c_base.val < B.val) {
                        // c can be placed on top of b
                        c_base.next = B;
                        B = C;
                        // place the node in tower c
                        TowerNode plucked = A;
                        A = A.next;
                        plucked.next = null;
                        C = c_base = plucked;

                        return shiftTower(++count, b_base, c_base);
                    }


                }

            }
        } else {
            if (C != null && B != null) {
                // merge towers into one
                if (b_base.val < C.val) {
                    // b can be placed on top of c
                    b_base.next = C;
                    C = B;
                    b_base = B = null;
                    return shiftTower(++count, b_base, c_base);

                } else if (c_base.val < B.val) {
                    // c can be placed on top of b
                    c_base.next = B;
                    B = C;
                    C = c_base = null;
                    return shiftTower(++count, b_base, c_base);
                }
            }
        }


        return count;


    }

    @Override
    public String toString() {
        return "ThreeTowers{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}