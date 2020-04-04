public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int length;

    public DoublyLinkedList() {
        head = tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        return head == null & tail == null;
    }

    public void insertAt(T info, int index) {
        if (index == 0 || isEmpty()) {
            addToHead(info);
        } else if (index == length) {
            addToTail(info);
        } else {
            Node<T> temp = head;
            for (int i = 0; temp != null && i < index - 1; i++) {
                temp = temp.next;
            }
            if (temp == null || index < 0) {
                try {
                    throw new IndexOutOfBoundsException(index);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return;
            } else {
                temp.next = new Node<T>(info, temp.next, temp);
                temp.next.next.previous = temp.next;
                length++;
            }

        }

    }

    public void addToHead(T info) {
        if (isEmpty()) {
            head = tail = new Node<T>(info, null, null);
        } else {
            head = new Node<T>(info, head, null);
            head.next.previous = head;
        }
        length++;
    }

    public void addToTail(T info) {
        if (isEmpty()) {
            head = tail = new Node<T>(info, null, null);
        } else {
            tail = new Node<T>(info, null, tail);
            tail.previous.next = tail;
        }
        length++;
    }

    public void printAll() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.info.toString() + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void pirntAllReverse() {
        Node<T> temp = tail;
        String str = "";
        while (temp != null) {
            str += temp.info.toString() + " ";
            temp = temp.previous;
        }
        for (int i = str.length() - 2; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}