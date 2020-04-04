public class SingLyLinkedList_Lab{
    public static void main(String[] args) {
        long sT = System.currentTimeMillis();
        SinglyLinkedList stuList = new SinglyLinkedList();
        stuList.addToHead(1, "Tom", "New York", "011", 3.2);
        System.out.println(stuList.head.studnetInfo.toString());
        stuList.addToHead(2, "Ann", "Bkk", "222", 3.8);
        System.out.println(stuList.head.studnetInfo.toString());
        stuList.addToHead(3, "Jack", "London", "333", 2.9);
        System.out.println(stuList.head.next.next.studnetInfo.toString());

        stuList.addToTail(4, "Sarah", "Tokyo", "444", 3.7);
        System.out.println(stuList.head.next.next.next.studnetInfo.toString());
        System.out.println(stuList.head.next.next.studnetInfo.toString());
        System.out.println();
        stuList.printAllStudent();
        System.out.println("--------------------------");
        stuList.addToTail(5, "Jim", "Berlin", "555", 2.1);
        stuList.addToHead(6, "Nicole", "Paris", "666", 3.4);
        stuList.printAllStudent();
        Student x = stuList.searchById(100);
        System.out.println("--------------------------");
        System.out.println(x!=null ? x.getName() : "Not found");
        System.out.println("--------------------------");
        x = stuList.searchByName("jack");
        System.out.println(x!= null? x.toString():"Not found");
        System.out.println("--------------------------");
        stuList.removeFromHead();
        stuList.printAllStudent();
        System.out.println("--------------------------");
        // stuList.removeFromTail();
        // stuList.printAllStudent();
        // stuList.removeFromTail();
        // stuList.printAllStudent();
        // stuList.removeFromTail();
        // stuList.printAllStudent();
        // stuList.removeFromTail();
        // stuList.printAllStudent();
        // stuList.removeFromTail();
        // stuList.printAllStudent();
        // stuList.removeFromTail();
        // stuList.printAllStudent();
        stuList.insert(7, "Kick Buttosky", "LA", "777", 1.5, 6);
        stuList.printAllStudent();
        System.out.println(stuList.tail.studnetInfo.toString());

        System.out.println("--------------------------");
        long eT = System.currentTimeMillis();
        System.out.println("Operation Time: " + (eT-sT));
    }
}