public class Node <T>{
    T info;
    Node<T> previous;
    Node<T> next;

    public Node(T info, Node<T> next, Node<T> previous){
        this.info = info;
        this.next = next;
        this.previous = previous;
    }
}