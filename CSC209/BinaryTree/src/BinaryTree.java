import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int info) {
        if (root == null) {
            root = new Node(info);
        } else {
            Node temp = root;
            while (true) {
                if (info < temp.info) {
                    if (temp.left != null) {
                        temp = temp.left;
                    } else {
                        temp.left = new Node(info);
                        break;
                    }
                } else {
                    if (temp.right != null) {
                        temp = temp.right;
                    } else {
                        temp.right = new Node(info);
                        break;
                    }
                }
            }
        }
    }

    public Node search(int info) {
        Node temp = root;
        while (temp != null) {
            if (info == temp.info) {
                System.out.println("Found it! " + info);
                return temp;
            } else if (info < temp.info) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        System.out.println("Cant find " + info);
        return null;
    }

}
