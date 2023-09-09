package concepts.datastuctures.linkedlist;

import java.util.stream.IntStream;

public class DoublyLinkedList {

    DoubleLinkedNode head, tail;

    void add(DoubleLinkedNode node) {
        if (this.head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    void print() {
        DoubleLinkedNode itr = head;
        while (itr != null) {
            System.out.println(itr.data);
            itr = itr.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        IntStream.range(0, 10).mapToObj(DoubleLinkedNode::new).forEach(list::add);
        list.print();

    }

}

class DoubleLinkedNode {
    int data;
    DoubleLinkedNode prev, next;

    DoubleLinkedNode(int data) {
        this.data = data;
    }

}
