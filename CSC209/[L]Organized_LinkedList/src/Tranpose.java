public class Tranpose extends DoublyLinkedList {

    public Tranpose() {
        super();
    }

    public void access(String info) {
        Node temp;
        for (temp = head; temp != null && !temp.info.equalsIgnoreCase(info); temp = temp.next);
        if (temp != null) {
            if(temp == head ){ // only 1

            } else { // 2 or more
                String tempValue = temp.info;
                temp.info = temp.prev.info;
                temp.prev.info = tempValue;
            }
            // // System.out.println(temp.getInfo() + " is founded.");
            // if (temp != tail && temp != head) {
            //     // temp.prev.prev.next = temp;
            //     // temp.prev.next = temp.next;
            //     // temp.next.prev = temp.prev;
            //     // temp.prev = temp.prev.prev;
            //     // temp.next.prev.prev = temp;
            //     // temp.next = temp.next.prev;

            // } else if (temp == head.next) {

            // } else if(temp == tail){

            // } else {

            // }
        } else {
            addToTail(info);
        }
    }
}
