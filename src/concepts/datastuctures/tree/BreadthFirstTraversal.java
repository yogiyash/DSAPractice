package concepts.datastuctures.tree;


/**
 * Level first traversal
 */
public class BreadthFirstTraversal {


    static void levelTraversal(BinaryTreeNode node, int level){

        if(node==null)
            return;
        if(level==1){
            System.out.println(node.data);
        }else{
            levelTraversal(node.left,level-1);
            levelTraversal(node.right,level-1);
        }
    }

    /***
     * another way is store all nodes in a queue and traverse the queue
     * @param node
     */

    static void levelTreversal(BinaryTreeNode node){
    int level=1;


    }

    static void addToQueue(BinaryTreeNode node,int level){

    }


}
