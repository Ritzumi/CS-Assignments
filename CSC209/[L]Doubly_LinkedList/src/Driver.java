public class Driver{
    public static void main(String[] args) {
        DoublyLinkedList<Integer> DLL = new DoublyLinkedList<>();
        DLL.addToHead(1);
        DLL.addToTail(5);
        DLL.printAll();
        DLL.insertAt(2, 1);
        DLL.printAll();
        DLL.insertAt(4, 2);
        DLL.insertAt(3, 2);
        DLL.printAll();
        DLL.pirntAllReverse();
        DLL.insertAt(6, 2);
        DLL.printAll();
        System.out.println(DLL.length);
    }
}