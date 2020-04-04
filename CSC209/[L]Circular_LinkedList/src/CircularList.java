/**
 * CircularList
 */
public class CircularList {
    Node head;
    Node tail;
    int length;

    public CircularList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void remove(int index) {
        if (isEmpty()) {
            return;
        } else if (length - 1 > index) {
            return;
        } else {
            if (index == 0 || length == 1) {
                if (length == 1) {
                    head = tail = null;
                } else {
                    head.next.prev = tail;
                    tail.next = head.next;
                    head = head.next;
                }
            } else if (index == length - 1) {
                tail.prev.next = head;
                head.prev = tail.prev;
                tail = tail.prev;
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next.next.prev = temp;
                temp.next = temp.next.next;
            }
        }
    }
}