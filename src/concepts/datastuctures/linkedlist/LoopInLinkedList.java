package concepts.datastuctures.linkedlist;

import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * problems related to loop in LinkedList
 */
public class LoopInLinkedList {


    void dosup(char a, int b) {


    }

    int dosup(int a, char b) {
        return 0;
    }

    public static void main(String[] args) {

        LoopInLinkedList obj = new LoopInLinkedList();
        SimpleLinkedList listOne = obj.generateListWithLoop();
        //check whether the loop is created
        LoopInLinkedList utility = new LoopInLinkedList();
        if (utility.detectLoopInList(listOne)) {
            System.out.println("loop exist in list");

            int loopLength = utility.findLengthOfLoop(listOne);
            System.out.println(String.format("loop len:%d", loopLength));

            // with floyd algo
            System.out.println(String.format("with floyd loop exist=%s", obj.FloydLoopDetectionAlgo(listOne)));

        }


        // create a smaller loop at test again
        LinkedNode node = listOne.head;
        LinkedNode second = node = node.next;
        LinkedNode third = node.next;
        third.next = second;

        if (utility.detectLoopInList(listOne)) {
            System.out.println("loop exist in list");

            int loopLength = utility.findLengthOfLoop(listOne);
            System.out.println(String.format("loop len:%d", loopLength));
            //  with floyd algo
            System.out.println(String.format("with floyd loop exist=%s", obj.FloydLoopDetectionAlgo(listOne)));
        }


    }


    SimpleLinkedList generateListWithLoop() {

        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        IntStream.range(1, 10).mapToObj(LinkedNode::new).forEach(list::add);


        LinkedNode node = list.head;
        LinkedNode fifth = null;
        while (node.next != null) {
            if (node.data.equals(5)) {
                fifth = node;
            }
            node = node.next;
        }

        //at the end of while we will have the last element
        //point that element to fifth node to create a loop;
        node.next = fifth;
        return list;
    }

    boolean detectLoopInList(SimpleLinkedList list) {
        LinkedNode node = list.head;
        HashMap<LinkedNode, Integer> visited = new HashMap<>();

        while (node != null) {
            Integer exists = visited.get(node);
            if (exists != null) {
                System.out.println("loop found");
                return true;
            }
            visited.put(node, 1);
            node = node.next;

        }
        System.out.println("no loop found");
        return false;


    }


    /**
     * to find the loop length we can keep the position in map too
     * and when repeated node is found check how far back was the node first encountered
     *
     * @param list
     * @return
     */
    int findLengthOfLoop(SimpleLinkedList list) {

        LinkedNode node = list.head;
        HashMap<LinkedNode, Integer> visitedMap = new HashMap<>();
        int index = 1;
        int loopLen = 0;
        while (node != null) {

            //check if this node was visited before
            Integer lastKnownIndex = visitedMap.get(node);
            if (lastKnownIndex == null) {
                //new node
                visitedMap.put(node, index);
            } else {
                // loop found return len
                loopLen = index - lastKnownIndex;
                break;
            }
            node = node.next;
            index++;


        }
        return loopLen;
    }

    /**
     * So we take 2 pointers pointing to head initially
     * while iterating
     * we increase first pointer by one lets name this as slow pointer
     * we increase the second pointer by two lets call this a fast pointer
     * if there is a loop in list eventually these pointers will  point to same node without ever raeching the end
     * how i understood this, Since with every iteration the difference between the pointers is increasing  by one so eventually the fast pointer will catch the slow pointer in second lap
     */
    boolean FloydLoopDetectionAlgo(SimpleLinkedList listwithloop) {
        LinkedNode slow, fast;
        slow = fast = listwithloop.head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;


    }

}
