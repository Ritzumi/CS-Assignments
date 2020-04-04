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

    public int length() {
        return length(root);
    }

    private int length(Node node) {
        if (node == null) {
            return 0;
        } else {
            return length(node.left) + length(node.right) + 1;
        }
    }

    public int leaves() {
        return leaves(root);
    }

    private int leaves(Node node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return 1;
        } else {
            return leaves(node.left) + leaves(node.right);
        }
    }

    public int rightChildren() {
        return rightChildren(root);
    }

    private int rightChildren(Node node) {
        if (node == null) {
            return 0;
        } else if (node.right != null) {
            return rightChildren(node.left) + rightChildren(node.right) + 1;
        } else {
            return rightChildren(node.left) + rightChildren(node.right);
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        } else if (node.left != null || node.right != null) {
            return Math.max(height(node.left) + 1, height(node.right) + 1);
        } else {
            return 1;
        }
    }

    public void breadthTraversal() { // level
        Node p = root;
        Queue<Node> queue = new LinkedList<>();
        if (p != null) {
            queue.add(p);
            while (!queue.isEmpty()) {
                p = queue.poll();
                System.out.print(p.info + " ");
                if (p.left != null) {
                    queue.add(p.left);
                }
                if (p.right != null) {
                    queue.add(p.right);
                }
            }
        }
        System.out.println();
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node != null) {
            System.out.print(node.info + " "); // V
            preorder(node.left); // L
            preorder(node.right); // R
        }

    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.info + " ");
            inorder(node.right);
        }

    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.info + " ");
        }

    }
}
