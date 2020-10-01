package concepts.datastuctures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.IntStream;

public class LinkedListManipulation {

    public static void main(String[] args) {
        LinkedListManipulation manipulation = new LinkedListManipulation();
        manipulation.findMiddle(2);
        manipulation.findMiddle(3);
        manipulation.findMiddle(5);
        manipulation.findMiddle(10);
        System.out.println(String.format("\ncount=%d",manipulation.countMultiplesOfNumber(3)));

    }

    /**
     * find middle element
     *  we start with the head and go upto the end of the list
     *  we increment node pointer everytime while we increment middle pointer once in every 2 time
     *  so when we reach the end of the list middle pointer should be in middle
     *  lets try it out
     *   @param len the length of linkedlist of which we want the middle element
     */
    void findMiddle(int len) {
        SimpleLinkedList<Integer> linkedList = getList(len);

        LinkedNode middle = linkedList.head;
        LinkedNode node = linkedList.head;


        boolean toggle =false;

        while(node!=null){
            node= node.next;
            if(toggle)
            {
                middle=middle.next;
                toggle=false;
            }else{
                toggle = true;
            }
        }

        linkedList.print();
        System.out.println(String.format("\nmiddle=%s\n",middle));
    }


    int  countMultiplesOfNumber(int num){
        SimpleLinkedList list  = getList(100);
        LinkedNode<Integer> node = list.head;
        int  count =0;
        while(node!=null){
            if(node.data%3==0){
                count++;
                System.out.print(node.data+" ");
            }
            node=node.next;
        }
        return count;
    }



    SimpleLinkedList getList(int len ){

        SimpleLinkedList<Integer> linkedList = new SimpleLinkedList<>();
        IntStream.range(1,len+1).mapToObj(LinkedNode::new).forEach(linkedList::add);
        return  linkedList;


    }

    /**
     * Iterate over  list , put nodes in hashmap if node already exist there is a loop;
     * @param list
     * @return
     */


}
