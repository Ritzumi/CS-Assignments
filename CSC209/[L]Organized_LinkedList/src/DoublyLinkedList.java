public class DoublyLinkedList {
    Node head, tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void addToTail(String info) {
        if (isEmpty()) {
            head = tail = new Node(info, null, null);
        } else {
            tail.next = new Node(info, null, tail);
            tail = tail.next;
        }

    }

    public void printAll() {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.getInfo() + " ");
        }
        System.out.println();
    }

}