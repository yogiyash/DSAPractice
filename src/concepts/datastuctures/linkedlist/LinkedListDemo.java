package concepts.datastuctures.linkedlist;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Linked List examples
 * Insertion
 * Deletion
 * Display
 * Search
 */
public class LinkedListDemo {

    public static void main(String[] args) {


        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        IntStream.range(1, 11).mapToObj(LinkedNode::new).forEach(list::add);
        list.print();


        // remove an element
        list.delete(9);
        list.delete(5);
        list.delete(0);

        //add some elements
        // ADD AN ELEMENT
        list.add(new LinkedNode<>(20));
        list.add(new LinkedNode<>(21));
        list.add(new LinkedNode<>(22));

        System.out.println("new list");
        list.print();

        System.out.println("search");
        LinkedNode node = list.find(21);
        Optional op = Optional.of(node);
        System.out.println(Thread.currentThread().getName());
        op.ifPresentOrElse(System.out::println,() -> {
            System.out.println("or else in :"+Thread.currentThread().getName());
        });
        node=list.find(30);
        op = Optional.ofNullable(node);
        System.out.println(op.isPresent());
        op.ifPresentOrElse(System.out::println,() -> {
            System.out.println("or else in :"+Thread.currentThread().getName());
        });





    }


}





