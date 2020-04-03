public class BinarySearchTreeLab {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(25);
        tree.insert(100);
        tree.insert(35);
        tree.insert(35);
        tree.insert(93);
        tree.insert(11);
        tree.insert(99);
        tree.insert(65);
        tree.insert(24);
        tree.insert(20);
        tree.insert(15);
        tree.insert(10);
        System.out.println(tree.root.right.left.right.right.info); // 93
        //Search
        tree.search(93);
        tree.search(110);
        tree.search(35);
        //Exercise
        System.out.println(tree.length());
        System.out.println(tree.leaves());
        System.out.println(tree.rightChildren());
        System.out.println(tree.height());
    }
}
