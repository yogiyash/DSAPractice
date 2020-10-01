package concepts.datastuctures;

import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * problems related to loop in LinkedList
 */
public class LoopInLinkedList {


    public static void main(String[] args) {

//        lets consider list of type int with loops
        SimpleLinkedList<Integer> listOne =new SimpleLinkedList<>();
        IntStream.range(1,10).mapToObj(LinkedNode::new).forEach(listOne::add);

        //lets create a loop
        LinkedNode node = listOne.head;
        LinkedNode fifth=null;
        while(node.next!=null){
            if(node.data.equals(5)){
                fifth=node;
            }
            node=node.next;
        }
        //at the end of while we will have the last element
        //lets point that element to fifth node to create a loop;
        node.next=fifth;

        //check whether the loop is created
        LoopInLinkedList utility = new LoopInLinkedList();
        if( utility.detectLoopInList(listOne)){
            System.out.println("loop exist in list");

            int loopLength = utility.findLengthOfLoop(listOne);
            System.out.println(String.format("loop len:%d",loopLength));
        }

        // create a smaller loop at test again
        node=listOne.head;
        LinkedNode second=node=node.next;
        LinkedNode third =node.next;
        third.next=second;

        if( utility.detectLoopInList(listOne)){
            System.out.println("loop exist in list");

            int loopLength = utility.findLengthOfLoop(listOne);
            System.out.println(String.format("loop len:%d",loopLength));
        }






    }




    boolean detectLoopInList(SimpleLinkedList list){
        LinkedNode node = list.head;
        HashMap<LinkedNode,Integer> visited = new HashMap<>();

        while(node!=null){
            Integer exists = visited.get(node);
            if(exists!=null)
            {
                System.out.println("loop found");
                return true;
            }
            visited.put(node,1);
            node=node.next;

        }
        System.out.println("no loop found");
        return false;


    }


    /**
     * to find the loop length we can keep the position in map too
     * and when repeated node is found check how far back was the node first encountered
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
                loopLen = index-lastKnownIndex ;
                break;
            }
            node = node.next;
            index++;


        }
        return loopLen;
    }

    boolean loopDetectionWith

}
