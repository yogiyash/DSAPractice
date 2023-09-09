package concepts.datastuctures.queue;

public class QueueNode<T> {
    QueueNode prev;
    QueueNode next;
    T val;

    QueueNode(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                " val=" + val +
                '}';
    }
}