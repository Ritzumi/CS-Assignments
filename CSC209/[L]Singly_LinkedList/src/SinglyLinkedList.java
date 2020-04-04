public class SinglyLinkedList {
    Node head, tail;

    public SinglyLinkedList() {
        head = tail = null;

    }

    public boolean isEmpty() {
        return head == null || tail == null;
    }

    public void addToHead(int id, String name, String address, String phoneNumber, double GPA) {
        // Create a node
        // Put info in
        // next will point to head
        // head point to this one
        if (isEmpty()) {
            head = new Node(id, name, address, phoneNumber, GPA, head);
            tail = head;
        } else {
            head = new Node(id, name, address, phoneNumber, GPA, head);
        }

    }

    public void addToTail(int id, String name, String address, String phoneNumber, double GPA) {
        // Create a node
        // Put info in
        // next will point to null
        // cureent tail node point to this one
        // tail point to this one

        if (this.isEmpty()) {
            head = tail = new Node(id, name, address, phoneNumber, GPA, null);
        } else {
            tail.next = new Node(id, name, address, phoneNumber, GPA, null);
            tail = tail.next;
        }
    }

    public void printAllStudent() {
        for (Node temp = head; temp != null; temp = temp.next) { // is not temp.next
            System.out.print(temp.studnetInfo.name + "-->");
        }
        System.out.println();
    }

    public void insert(int id, String name, String address, String phoneNumber, double GPA, int position) {
        // Search p-1 th node (at postion p-1)
        // create a new node
        // put values in the new node
        // new node points to p node which is temp.next
        // p-1 poin to new node
        if (isEmpty()) {
            addToHead(id, name, address, phoneNumber, GPA);
        } else {
            Node temp = head;
            for (int i = 0; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp == null || temp == tail) {
                addToTail(id, name, address, phoneNumber, GPA);
            }
            if (temp != null) {
                if (position == 0) {
                    addToHead(id, name, address, phoneNumber, GPA);
                } else {
                    temp.next = new Node(id, name, address, phoneNumber, GPA, temp.next);
                }
            } else {
                System.out.println("Overflow");
            }
        }
    }

    public Student searchById(int id) {
        Node temp;
        for (temp = head; temp != null && temp.studnetInfo.id != id; temp = temp.next) {
        }
        if (temp == null)
            return null;
        return temp.studnetInfo;
    }

    public Student searchByName(String name) {
        Node temp;
        for (temp = head; temp != null && !temp.studnetInfo.name.equalsIgnoreCase(name); temp = temp.next)
            ;
        if (temp == null)
            return null;
        return temp.studnetInfo;
    }

    public void removeFromHead() {
        if (head == tail) { // one or nothing
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeFromTail() {
        if (head == tail) { // one or nothing
            head = tail = null;
        } else {
            Node temp;
            for (temp = head; temp.next.next != null; temp = temp.next)
                ;
            tail = temp;
            temp.next = null;
        }
    }

    public void compareTo(SinglyLinkedList list){
        boolean isSame = true; 
        for (Node l1 = this.head, l2 = list.head; l1 != null || l2 != null ;) {
            if(l1.studnetInfo != l2.studnetInfo){
                System.out.println("Not same");
                isSame = false;
                break;
            }
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        if(isSame){
            System.out.println("Same");
        }
    }

}