public class Node {
    Student studnetInfo;
    Node next;

    public Node(Student studnetInfo, Node next) {
        this.studnetInfo = studnetInfo;
        this.next = next;
    }

    public Node(int id, String name, String address, String phoneNumber, double GPA, Node next) {
        studnetInfo = new Student(id, name, address, phoneNumber, GPA);
        this.next = next;
    }

    public String toString() {
        return "Are you sure?";
    }

}