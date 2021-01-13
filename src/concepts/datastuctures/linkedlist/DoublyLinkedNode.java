package concepts.datastuctures.linkedlist;

public class DoublyLinkedNode<T> extends LinkedNode {
        LinkedNode<T> prev;

    DoublyLinkedNode(LinkedNode prev, T data, LinkedNode next) {
            super(data);
            this.prev = prev;
            this.next = next;

        }
    }

