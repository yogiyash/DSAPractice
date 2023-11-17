package neetcode;

public class Minstack {



    public static void main(String[] args) {
        Minstack stack = new Minstack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }

    private simplestack stack, minstack;

    public Minstack(){
        stack = new simplestack();
        minstack = new simplestack();
    }
    
    public void push(int val) {


        if(stack.head==null){
            minstack.push(val);
        }else if(minstack.top()>val){
            minstack.push(val);
        }else{
            minstack.push(minstack.top());
        }
        
        stack.push(val);
        
       
    }
    
    public void pop() {
      stack.pop();
      minstack.pop();
    }
    
    public int top() {
        return stack.top();
        
    }
    
    public int getMin() {
        return minstack.top();
    }

    


}

class simplestack {
    Node head;

    void push(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
    }

    void pop(){
        if(head!=null){
            head = head.next;
        }
    }

    int top() {
        return head.val;
    }

}

class Node {
    Node next;
     int val;

    Node(int val){
        this.val = val;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */