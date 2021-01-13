package concepts.datastuctures.tree;

import static concepts.datastuctures.tree.DepthFirstTraversal.*;

public class TreeManipulation {


    public static void main(String[] args) {

        BinaryTreeNode root = createTree();

        System.out.println("preOrder");
        preOrder(root, 1);

        System.out.println("inOrder");
        inOrder(root, 1);

        System.out.println("postOrder");
        postOrder(root, 1);

        System.out.println("calculate height");
        int height = root.calculateHeight(root,0);



        for(int i =0;i<height;i++){

        }

        System.out.println("level traversal");




    }




    static BinaryTreeNode createTree() {

        /** for exammple consider following tree
         1
         /            \
         2              3
         /  \           /  \
         4    5          6     7
         / \   / \       /  \   /  \
         8   9  10  11    12  13  14  15
         **/


        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(null, null, null, 1);

        BinaryTreeNode<Integer> two = new BinaryTreeNode<>(null, root, null, 2);
        root.left = two;

        BinaryTreeNode<Integer> three = new BinaryTreeNode<>(null, root, null, 3);
        root.right = three;

        BinaryTreeNode<Integer> four = new BinaryTreeNode<>(null, two, null, 4);
        two.left = four;

        BinaryTreeNode<Integer> five = new BinaryTreeNode<>(null, two, null, 5);
        two.right = five;

        BinaryTreeNode<Integer> six = new BinaryTreeNode<>(null, three, null, 6);
        three.left = six;

        BinaryTreeNode<Integer> seven = new BinaryTreeNode<>(null, three, null, 7);
        three.right = seven;

        BinaryTreeNode<Integer> eight = new BinaryTreeNode<>(null, four, null, 8);
        four.left = eight;


        BinaryTreeNode<Integer> nine = new BinaryTreeNode<>(null, four, null, 9);
        four.right = nine;


        BinaryTreeNode<Integer> ten = new BinaryTreeNode<>(null, five, null, 10);
        five.left = ten;

        BinaryTreeNode<Integer> eleven = new BinaryTreeNode<>(null, five, null, 11);
        five.right = eleven;


        BinaryTreeNode<Integer> twelve = new BinaryTreeNode<>(null, six, null, 12);
        six.left = twelve;

        BinaryTreeNode<Integer> thirteen = new BinaryTreeNode<>(null, six, null, 13);
        six.right = thirteen;


        BinaryTreeNode<Integer> fourteen = new BinaryTreeNode<>(null, seven, null, 14);
        seven.left = fourteen;

        BinaryTreeNode<Integer> fifteen = new BinaryTreeNode<>(null, seven, null, 15);
        seven.right = fifteen;

        BinaryTreeNode<Integer> sixteen = new BinaryTreeNode<>(null, fifteen, null, 16);
        fifteen.right = sixteen;



        return root;

    }
}


