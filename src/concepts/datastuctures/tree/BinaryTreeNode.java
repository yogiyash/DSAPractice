package concepts.datastuctures.tree;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode root, left, right;

    BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode root, BinaryTreeNode right, T data) {
        this.left = left;
        this.right = right;
        this.root = root;
        this.data = data;
    }




    public int calculateHeight(BinaryTreeNode node,int sum){

        if(node==null)
            return sum;

        int left = calculateHeight(node.left,sum+1);
        int right = calculateHeight(node.right,sum+1);

        return left>right?left:right;

    }


}
