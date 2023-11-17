package leetcode.array;

public class MergeSortTwoDescendingOrderArray {

    public static void main(String[] args) {
        int[] nums1 = new int[] { 8, 6, 3, 0, 0, 0, 0, 0, 0,0 };
        int[] nums2 = new int[] { 9, 7, 5, 4, 3, 2, 1 };
        new MergeSortTwoDescendingOrderArray().merge(nums1, 3, nums2, 7);
       // new MergeSortTwoDescendingOrderArray().checker();
      
    
    
    }

    void checker(){
  que q  =  new que();
        
        q.nq(1);
        q.nq(2);
        q.dq();
        q.poll();
    }

   
    private void printarr(int []arr){
        for (int i: arr){
            System.out.print(i+ ",");
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0;
        que extras = new que();

        if (n == 0)
            return;
        else if(m == 0 && n <0){
            while(j<n)
            nums1[i++] = nums2[j++];
        }

        

        while(i<m){

            if (extras.poll()!=null){
                if(nums1[i] < extras.poll().data && nums2[i] < extras.poll().data){
                    nums1[i++] = extras.dq().data; 
                }else if (nums1[i] < nums2[j] && extras.poll().data < nums2[j]){
                    extras.nq(new quenode(nums1[i]));
                    nums1[i++] = nums2[j++];
                }
            }else if (nums1[i] < nums2[j] ){
                extras.nq(new quenode(nums1[i]));
                nums1[i++] = nums2[j++];
            }
        }
        // may be items in que and b 

        while (j < n || extras.poll()!=null){
            if(extras.poll()==null){
                // copy remain of b
                while(j<n){
                    nums1[i++]=nums2[j++];
                }

            }else if (j==n){
                // copy extras
                while(extras.poll()!=null){
                    nums1[i++]=extras.dq().data;
                }
            }else {
                if(extras.poll().data > nums2[j]){
                    nums1[i++]=extras.dq().data;
                }else{
                    nums1[i++]=nums2[j++];
                }
            }


        }

        printarr(nums1);


    }

     class que {
        quenode head, tail = null;

        void nq(quenode n) {
            if (head == null) {
                head = tail = n;
            } else {
                tail.next = n;
                tail = n;
            }
        }
        void nq(int a){
            nq(new quenode(a));
        }

        quenode poll() {
            return head;
        }

        quenode dq() {
            quenode data = null;
            if (head != null) {
                if (head != tail ) {
                    // more that 1 element;
                    data = head;
                    head = head.next;
                } else {
                    // single element
                    data = head;
                    head = tail = null;
                }

            }
            return data;
        }
    }

    class quenode {
        int data;
        quenode next;
        quenode(){};
        quenode(int a){
            this.data=a;
        }

    }

}