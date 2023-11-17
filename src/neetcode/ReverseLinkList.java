package neetcode;

public class ReverseLinkList {
    


//1->2->3->4->5

//temp->
//1->    2->3->4->5


private Node rev (Node current){

    Node newlist;

    while(current!=null)
    {    
        Node temp = current;
        current = current.next;
        temp.next = newlist;
        newlist = temp;
    }

    return newlist;


    }



private Node reverse(Node node){


Node current = node;
Node last = node;
//2->1->3->4->5\\\

Node temp = node.next; //2->3->4...
Node nextNode = node.next.next;//3->4->5
node.next = last; // 1->null 
temp.next=node;//2->1

//3

//3->2->1->4->5

//4->\\\
    Node temp = node.next;
    node.next=head;





}





}





}

class Node{
    Node next;
    int val;
}