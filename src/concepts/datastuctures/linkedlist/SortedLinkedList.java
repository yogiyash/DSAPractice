package concepts.datastuctures.linkedlist;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedLinkedList {

    sortedNode head, tail;
    private int size = 0;
    private int capacity = 0;

    SortedLinkedList(int capacity) {
        this.capacity = capacity;
    }

    int[] getData(int n) {
        if (n < 1) {
            n = size;
        }
        int arr[] = new int[n];
        sortedNode itr = head;
        int counter = 0;

        while (counter < n) {
            arr[counter++] = itr.data;
            itr = itr.next;
        }
        return arr;

    }

    boolean add(int n) {
        return add(new sortedNode(n));
    }

    void printList() {
        sortedNode ref = head;
        while (ref != null) {
            System.out.println(ref.data);
            ref = ref.next;
        }

    }

    boolean add(sortedNode node) {

        // first node
        
        if (head == null) {
            head = node;
            tail = node;
            size = 1;
            return true;
        }

        else {

            sortedNode itr = head;
            boolean added = false;

            while (itr != null) {

                if (itr.data < node.data) {
                    // if node is greater than current node
                    node.prev = itr.prev;
                    node.next = itr;
                    itr.prev = node;
                    if (itr == head) {
                        head = node;
                    } else {
                        node.prev.next = node;
                    }
                    added = true;
                    size++;
                    break;
                } else {
                    itr = itr.next;
                }
            }

            if (!added) {
                node.prev = tail;
                tail.next = node;
                tail = node;
                size++;
            }

        }

    
         if (size > capacity) {
        tail.prev.next = null;
        
          tail = tail.prev;
          size--;
          }
         
        return true;

    }

    public static void main(String[] args) {

        SortedLinkedList list = new SortedLinkedList(5);
       int arr[] = new int[] { 4, 5, 3, 1, 2,6, 3, 10, 9, 8, 7 };
        // IntStream.range(1, 50).forEach(list::add);
        for (int l : arr) {
            list.add(l);
        }

        Arrays.stream(list.getData(5)).forEach(System.out::println);

    }

}

class sortedNode implements Comparable<sortedNode> {
    int data;
    sortedNode prev;
    sortedNode next;

    @Override
    public int compareTo(sortedNode o) {
        if (o.data < this.data)
            return -1;
        else if (this.data < o.data)
            return 1;
        else
            return 0;
    }

    public sortedNode(int data) {
        this.data = data;
    }

}