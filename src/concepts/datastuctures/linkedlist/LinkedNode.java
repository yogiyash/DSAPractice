package concepts.datastuctures.linkedlist;

public class  LinkedNode<T> {
        T data;
        LinkedNode next;

        LinkedNode(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return " LinkedNode{" +
                    data +
                    '}';
        }
    }

