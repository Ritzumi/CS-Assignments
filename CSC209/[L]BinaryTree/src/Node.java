public class Node {
    int info;
    Node left, right;

    public Node(int info) {
        this.info = info;
        left = right = null;
    }


    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
