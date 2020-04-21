import java.util.Arrays;

public class HeapDriver {
    public static void main(String[] args) {
        Heap heap = new Heap(10);
        //Enqueue
        System.out.println("Enqueue");
        heap.enqueue(15);
        heap.enqueue(20);
        heap.enqueue(9);
        heap.enqueue(99);
        heap.enqueue(83);
        heap.enqueue(22);
        heap.enqueue(-100);
        heap.enqueue(0);
        heap.enqueue(66);
        heap.enqueue(200);

        /*
                            15
                      83            22
                66         20   9       -100
             0     15  200
         */
        //Display
        for (int i = 0; i < heap.size; i++) {
            System.out.print(heap.heap[i] +" ");
        }
        System.out.println();
        System.out.println(heap.heap[0]);
        //Dequeue
        System.out.println("Dequeue");
        System.out.println(heap.dequeue());
        System.out.println(heap.dequeue());
        while (!heap.isEmpty()){
            System.out.print(heap.dequeue() + " ");
        }
        System.out.println();
    }
}
