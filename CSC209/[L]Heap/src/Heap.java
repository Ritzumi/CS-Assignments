public class Heap {
    int[] heap;
    int size;

    public Heap() {
        this(100);
    }

    public Heap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return heap.length == size;
    }

    public void enqueue(int value) {
        if (!isFull()) {
            heap[size] = value;
            int index = size;
            int parentIndex = (int) Math.floor((index - 1) / 2.0);
            while (index > 0 && heap[index] > heap[parentIndex]) {
                int temp = heap[parentIndex];
                heap[parentIndex] = heap[index];
                heap[index] = temp;
                index = parentIndex;
                parentIndex = (int) Math.floor((index - 1) / 2.0);
            }
            size++;
        } else {
            System.out.println("This heap is at max capacity >_>");
        }
    }

    public int dequeue() {
        int max = heap[0];
        heap[0] = heap[size-1];
        size--;
        int index = 0;
        int leftIndex = 2*index+1;
        int rightIndex = 2*index+2;
        int swapIndex = 0;
        while ((leftIndex < size && heap[index] < heap[leftIndex]) || // If no left then no right
                (rightIndex < size && heap[index] < heap[rightIndex] )){
            if(leftIndex == size-1){ // Left only  (No right only!)
                swapIndex = leftIndex;
            } else {// both left and right
                if(heap[leftIndex] > heap[rightIndex]){
                    swapIndex = leftIndex;
                } else {
                    swapIndex = rightIndex;
                }
            }
            int temp  = heap[index];
            heap[index] = heap[swapIndex];
            heap[swapIndex] = temp;
            index = swapIndex;
            leftIndex = 2*index+1;
            rightIndex = 2*index+2;
        }
        return max;
    }
}
