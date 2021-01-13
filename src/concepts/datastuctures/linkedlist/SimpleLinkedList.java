package concepts.datastuctures.linkedlist;

import java.util.Objects;

public class SimpleLinkedList<T> {
        LinkedNode head;
        LinkedNode tail;


        void add(LinkedNode<T> node) {
            if (head == null)
                head = tail = node;
            else {

                tail.next = node;
                tail = node;
            }
        }


        void delete(int index) {
            if (head == null)
                throw new ArrayIndexOutOfBoundsException("index out of bound" + index);

            LinkedNode node = head;
            LinkedNode lastNode = head;

            int move = 0;
            // goto element;
            while (move < index && node.next != null) {
                lastNode = node;
                node = node.next;
                move++;
            }

            if (move < index) {
                throw new ArrayIndexOutOfBoundsException("index out of bound" + index);
            }

            if (node == head) {
                if (head == tail)
                    // delete first and only element
                    head = tail = null;
                else {
                    head = head.next;
                }
            } else if (node == tail) {
                //delete last element
                lastNode.next = null;
                tail = lastNode;
            } else {
                //delete something in between
                lastNode.next = node.next;
            }
        }

        void print() {
            LinkedNode node = head;
            while (node != null) {
                System.out.println(node);
                node = node.next;
            }
        }

        /**
         * Find nth element, considering index zero based
         *
         * @param n
         * @param node
         * @return
         */
        LinkedNode find(int n, LinkedNode node) {
            if (node == null)
                return null;

            if (n > 0)
                find(n - 1, node.next);

            return node;
        }

        LinkedNode find(T val) {

            LinkedNode result = null;
            LinkedNode node = head;
            while (node != null) {
                if (Objects.equals(node.data, val)) {
                    result = node;
                    break;
                }
                node = node.next;
            }
            return result;
        }

    }
