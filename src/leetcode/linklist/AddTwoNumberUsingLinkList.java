package leetcode.linklist;

public class AddTwoNumberUsingLinkList {

  class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }



        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            if(l1 ==null && l2 ==null)
                return null;
            else  if(l1==null)
                return l2;
            else if(l2==null)
                return l1;


            int carry = 0;
            ListNode result = null,head=null;


            while(l1!=null || l2!=null||carry>0){
                int sum = (l1==null?0:l1.val)+ (l2==null?0:l2.val)+carry;

                if(sum < 10 )
                    carry =0;

                if(sum == 10)
                {
                    sum = 0;
                    carry = 1;

                }else{

                    carry = sum/10;
                    sum = sum %10;

                }


                if(l1!=null)
                    l1=l1.next;


                if(l2!=null)
                    l2=l2.next;


                if(result ==null)
                {
                    result = new ListNode(sum);
                    head = result;

                }else{
                    result.next = new ListNode(sum);
                    result = result.next;

                }



            }
            return head;




    }
}
