package concepts.datastuctures;

import java.util.stream.IntStream;

/**
 * A queue implementation with enque,deque,traversal
 */
public class SimpleQueue<T> {

    public static void main(String[] args) {

        SimpleQueue <Integer> que= new SimpleQueue<>();
        IntStream.range(1,11).mapToObj(QueueNode::new).forEach(que::enqueue);
        System.out.println(que);
        QueueNode a= que.dequeue();
        QueueNode b= que.dequeue();
        que.enqueue(a);
        que.enqueue(b);
        System.out.println("altered queue");
        System.out.println(que);
    }

    QueueNode<T> head;
    QueueNode<T> tail;

    SimpleQueue() {

    }

    /**
     * add element to the end of queue
     * @param node
     */
    public void enqueue(QueueNode node) {
        if (head == null) {
            //no items in queue
            head = tail = node;

        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    /**
     * Remove  the first element
     * @return
     */
    public QueueNode<T> dequeue() {

        QueueNode plucked =null;

        if (head == null)
        {

        }else if (head == tail) {
            // return the first and only element
            plucked = head;
            head = tail = null;
            return plucked;
        }else{
        plucked = head;
        head = head.next;
        plucked.next = null;
        }

        return plucked;
    }

    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
        builder.append("SimpleQueue{" );
        if(head!=null){
            QueueNode node = head;
            while(node!=null){
                builder.append(node).append(",");
                node=node.next;
            }
            //remove last comma
            builder.setLength(builder.length()-1);
        }
        builder.append('}');
        return  builder.toString();
    }
}

class QueueNode<T> {
    QueueNode prev;
    QueueNode next;
    T val;
    QueueNode(T val){
        this.val =val;
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                " val=" + val +
                '}';
    }
}