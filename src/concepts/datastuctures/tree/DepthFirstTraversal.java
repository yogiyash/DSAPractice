package concepts.datastuctures.tree;

public class DepthFirstTraversal {

    static void preOrder(BinaryTreeNode node, int level) {
        if (node != null) {
            String out = String.format("level%d val =%s", level, node.data);
            System.out.println(out);
            preOrder(node.left, level + 1);
            preOrder(node.right, level + 1);

        }


    }


    static void inOrder(BinaryTreeNode node, int level) {
        if (node != null) {
            inOrder(node.left, level + 1);
            String out = String.format("level%d val =%s", level, node.data);
            System.out.println(out);
            inOrder(node.right, level + 1);
        }
    }

    static void postOrder(BinaryTreeNode node, int level) {
        if (node != null) {
            inOrder(node.left, level + 1);
            inOrder(node.right, level + 1);
            String out = String.format("level%d val =%s", level, node.data);
            System.out.println(out);

        }
    }
}
