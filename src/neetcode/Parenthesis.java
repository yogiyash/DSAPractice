package neetcode;

public class Parenthesis {

    class Stack {

        Node head = null;

        void push(Node n) {
            if (head == null) {
                head = n;
            } else {
                n.next = head;
                head = n;
            }
        }

        boolean isEmpty() {
            return head == null;
        }

        Node poll(){
            if(head == null)
                return null;
            else 
                return new Node(head.data);
        }

        Node pop() {
            Node node = null;
            if (head != null) {
                node = head;
                head = head.next;
            }
            return node;
        }

    }

    class Node {
        Character data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    public boolean isValid(String s) {
        char[] brackets = s.toCharArray();
        Stack stack = new Stack();
        for (char b : brackets) {

            if (b == '(' || b == '{' || b == '[') {
                stack.push(new Node(b));
                continue;
            }

            else {
                Node top = stack.poll();
                if (top == null)
                    return false;
                else if (b == ')' && top.data == '(') {

                } else if (b == '}' && top.data == '{') {

                } else if (b == ']' && top.data == '[') {

                } else
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        Parenthesis p = new Parenthesis();
        String one = "}([{}])}";
        String two = "{[()]}";
        System.out.println(p.isValid(one));
        System.out.println(p.isValid(two));
    }

}
