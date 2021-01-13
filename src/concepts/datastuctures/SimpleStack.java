package concepts.datastuctures;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Stack implementation, push pop and traversal;
 */

public class SimpleStack<T> {


    private StackNode<T> head;


    void push(T val) {
        StackNode node = new StackNode(val);
        if (head.next == null)
            head.next = node;
        else {
            // add element to top ;
            node.next = head.next;
            head.next = node;
        }
    }

    T pop() {
        if (head.next == null)
            return null;

        StackNode<T> node = head.next;
        head.next = node.next;
        return node.getVal();
    }

    //taversal;
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SimpleStack{");
        StackNode node = head;
        while (node.next != null) {
            node = node.next;
            builder.append(node.getVal());
        }

        builder.append("}");
        return builder.toString();
    }

    public void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        StackNode<T> node = head;
        while (node.next != null) {
            node = node.next;
            action.accept(node.getVal());
        }
    }

}


class StackNode<T> {

    private final T val;
    StackNode<T> next;

    StackNode(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

}

