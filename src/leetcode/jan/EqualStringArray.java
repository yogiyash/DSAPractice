package leetcode.jan;

import java.util.HashMap;

public class EqualStringArray {


        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

            HashMap<Integer,CharNode> map = new HashMap<>();

            int pos = 0 ;

            CharNode head=null,curr=null;

            for(String word : word1){
                char [] chars = word.toCharArray();
                for (char c : chars){
                    CharNode node =new CharNode(c);
                    if(head==null){
                        head = node;
                        curr = node;
                    }else{
                        curr.next = node;
                        curr= curr.next;
                    }
                    map.put(pos++,node);
                }
            }

            int linkListLen = pos;

            //
            boolean equals = true;

            pos = 0 ;
            for(String word:word2){

                char [] chars = word.toCharArray();
                for (char c : chars){
                    CharNode node = map.get(pos++);
                    if(node==null || c!=node.val){
                        equals = false;
                        break;
                    }

                }

            }

            return pos==linkListLen && equals;


        }

        class CharNode{
            char val ;
            CharNode next;
            public CharNode(char val){this.val =val;}    }

}
