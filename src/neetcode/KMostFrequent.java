package neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class KMostFrequent {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            int freq = map.getOrDefault(ele, 0);
            map.put(ele, freq + 1);
        }
        SortedLinkedList list = new SortedLinkedList(k);
        Set<Integer> keys = map.keySet();
        keys.forEach(key -> list.add(new sortedNode(map.get(key), key)));
        return list.getData(0);

    }


    public static void main(String[] args) {
        int arr [] = new int [] {1 };//,1,1,2,2,3};
        
        int result [] = new KMostFrequent().topKFrequent(arr , 1);
    
        Arrays.stream(result).forEach(System.out::println);
        
        
        // new KMostFrequent().topKFrequent(arr, 1)

        // [1]
    }

}

class sortedNode implements Comparable<sortedNode> {
    int data;
    int element;
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

    public sortedNode(int data,int element) {
        this.data = data;
        this.element = element;
    }

}

 class SortedLinkedList {

    sortedNode head, tail;
    private int size = 0;
    private int capacity = 0;

    public SortedLinkedList(int capacity) {
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
            arr[counter++] = itr.element;
            itr = itr.next;
        }
        return arr;

    }

    boolean add(int n,int key ) {
        return add(new sortedNode(n,key));
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


}