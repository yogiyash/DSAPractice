package concepts;

import java.util.ArrayList;
import java.util.List;

/*
 * The difference between using a <? extends T>  vs <? super T>when using generics
 * Following PECS rules
 */
public class GenericExample {

    /**
     * classes in hierarchy
     */
    class GrandFather {
    }

    class Father extends GrandFather {
    }

    class Child extends Father {
    }


    /**
     * When we are only pulling the items from collection i.e the collection is acting as a producer we should use extends
     * as any item that extends a type T can be referenced with type T
     * Note adding will not be allowed because of ambiguity
     */
    void producerCollection() {
        List<? extends Father> list = new ArrayList<Father>();
        list = new ArrayList<Child>();
        Father a = list.get(0);
    }

    /**
     * When we as only adding stuff to collection we should use super
     * as the item added in a type safe way referencing with type T
     * read will not be type safe
     */
    void consumerCollection() {
        // the list is atmost a fathers
        List<? super Father> list = new ArrayList<Father>();
        list = new ArrayList<Object>();
        list.add(new Father());
        list.add(new Child());
    }

    /**
     * when a collection needs both adding and reading use the exact generic type instead
     */
    void hybridCollection() {
        List<Father> list = new ArrayList<Father>();
    }

}
