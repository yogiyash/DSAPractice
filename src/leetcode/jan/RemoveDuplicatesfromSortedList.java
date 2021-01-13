package leetcode.jan;

/**no duplicate elements
 *
 */
public class RemoveDuplicatesfromSortedList {

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public static void main(String[] args) {
     new RemoveDuplicatesfromSortedList().main();

    }


    private  void main() {
//        ListNode head = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,new ListNode(3,new ListNode(5,new ListNode(5,new ListNode(6,new ListNode(7,new ListNode(8,new ListNode(8))))))))))));
        ListNode head = new ListNode(1,new ListNode(1));

        System.out.println("before op");
        iterate(head);

        System.out.println("after ops");
        iterate(unique(head));
    }

    public void iterate (ListNode node ){

         if(node ==null)
         {  System.out.println("empty list");
         return ;
         }

         String format = "%d->";
         while(node!=null){
             System.out.print(String.format(format,node.val));
             node=node.next;
         }

    }

    public ListNode unique (ListNode head){

         //empty list or single item
         if(head == null || head.next == null)
             return  head;


        ListNode u = null;
        ListNode n = head;
        ListNode l = head.next;

         while( n!=null){

             if(l.val!=n.val){
                 u = l;
                 l = n;
                 n = n.next;
             }else {

                 while(n!=null && n.val ==l.val){
                     n=n.next;
                 }

                 //end of list return the list no need to append
                 if(n==null){
                     if(u==null){
                     head = null;
                     }else{
                     u.next =null;
                     }
                     break;
                 }else{
                     //append this to last known unique to this list
                     if(u==null){
                         // no previous list
                         head = n;
                         l=n;
                         n=n.next;
                     }else {

                     u.next =n;
                     l=n;
                     n=n.next;
                     }
                 }
             }

         }
return head;
    }


 //pro solution
            public ListNode deleteDuplicates(ListNode head) {
                ListNode dump =  new ListNode();
                dump.next = head;
                ListNode pre = dump;
                ListNode current = head;
                int frequency = 1;

                while(current != null) {
                    ListNode temp = current.next;
                    while(current != null && temp != null && temp.val == current.val) {
                        temp = temp.next;
                        frequency ++;
                    }

                    if(frequency == 1) {

                        pre.next = current;
                        pre = current;
                    } else {
                        frequency = 1;
                    }
                    current = temp;
                }
                pre.next = current;

                return dump.next;
            }



}
