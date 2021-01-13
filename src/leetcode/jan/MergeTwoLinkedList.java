package leetcode.jan;

public class MergeTwoLinkedList {


      class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            ListNode result = null, resultStart = null;

            boolean first = l1 != null, second = l2 != null;


            while (first || second) {

                if (first && second) {
                    // both present
                    ListNode smaller = null;

                    if (l1.val < l2.val) {

                        //use first
                        smaller = l1;
                        l1 = l1.next;

                    } else {

                        //use second
                        smaller = l2;
                        l2 = l2.next;

                    }

                    if (result == null) {

                        result = smaller;
                        result.next = null;
                        resultStart = result;
                    } else {
                        result.next = smaller;
                        smaller.next = null;
                        result = smaller;

                    }
                } else if (first) {
                    //copy first list

                    if (result == null) {
                        result = l1;
                        l1 = l1.next;
                        result.next = null;
                        resultStart = result;
                    } else {
                        result.next = l1;
                        l1 = l1.next;
                        result = result.next;
                        result.next = null;
                    }

                } else if (second) {
                    //copy second list

                    if (result == null) {

                        result = l2;
                        l2 = l2.next;
                        result.next = null;
                        resultStart = result;
                    } else {


                        result.next = l2;
                        l2 = l2.next;
                        result = result.next;
                        result.next = null;
                    }
                }

                first = l1 != null;
                second = l2 != null;

            }
            return resultStart;


        }

    }

