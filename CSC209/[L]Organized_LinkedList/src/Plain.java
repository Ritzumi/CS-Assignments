public class Plain extends DoublyLinkedList{

    public Plain(){
        super();
    }

    public void access(String info){
        Node temp;
        for (temp = head; temp != null && !temp.info.equalsIgnoreCase(info); temp = temp.next);
        if(temp != null){
            System.out.println(temp.getInfo() + " is founded.");
        } else {
            System.out.println(info + " is not founded");
            this.addToTail(info);
        }
    }
}