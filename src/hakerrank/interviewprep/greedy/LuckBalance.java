package hakerrank.interviewprep.greedy;

public class LuckBalance {

    static class node{
        int val;
        node next ;

        node(int val){
            this.val =val;
        }
    }

    // maintain  a decending list
    static class NodeList{
        node head  = null;

        int pop(){

            if(head==null)
                return 0;
            else {
                int val = head.val;
                head= head.next;
                return val;
            }
        }

        void add(int val){

            if(head == null)
            {
                head = new node(val);
            }

            else{
                node point = head,prev=head;

                while(point!=null) {
                    if(point.val<=val){
                        node n = new node(val);
                        n.next = point;
                        if(point == head ){
                            // first node
                            head = n;
                        }else{
                            prev.next = n;

                        }
                        break;

                    }
                    prev= point;
                    point = point.next;
                }

                if(point==null)
                {// reached end
                    node n = new node(val);
                    prev.next = n;


                }

            }


        }

    }



    static int luckBalance(int k, int[][] contests) {

        NodeList loseList  = new NodeList();


        int luck =0;
        for (int [] event :contests){
            if(event[1]==1){
                //important
                loseList.add(event[0]);
            }else{
                luck += event[0]  ;
            }
        }

        for(int i=0;i<k;i++){
            luck+=loseList.pop();
        }
        while(loseList.head!=null){
            luck -= loseList.pop();
        }

        return luck ;

    }

    public static void main(String[] args) {

        int k =  3;

        int [][] contents = new int[][]{{5,1},{2,1},{1,1},{8,1},{10,0},{5,0}};
        luckBalance(k,contents);



    }


}
