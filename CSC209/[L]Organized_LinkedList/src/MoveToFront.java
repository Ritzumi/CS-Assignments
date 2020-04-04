public class MoveToFront extends DoublyLinkedList{
    

    public MoveToFront() {
        super();
    }

    public void access(String info){
        Node temp;
        for (temp = head; temp != null && !temp.info.equalsIgnoreCase(info); temp = temp.next);
        if(temp != null){
            //System.out.println(temp.getInfo() + " is founded.");
            if(temp != tail && temp != head){
                //remove it from list
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                //add to head and remove reference
                temp.next = head;
                head.prev = temp;
                temp.prev = null;
                head = temp;
            } else if (temp == tail) {
                //remove from tail
                temp.prev.next = null;
                tail = tail.prev;
                //add to head and remove reference
                temp.next = head;
                head.prev = temp;
                temp.prev = null;
                head = temp;
            } else {
                
            }
        } else {
           // System.out.println(info + " is not founded");
            this.addToTail(info);
        }
    }
    
}