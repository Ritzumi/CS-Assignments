import java.util.Arrays;

/**
 * Stack
 */
public class Stack {
    private int[] info;
    int size;

    public Stack(int capacity) {
        info = new int[capacity];
        size = 0;
    }

    public void push(int value) {
        boolean isFull = size < info.length;
        if (isFull) {
            info[size] = value;
            size++;
        }
    }

    public int pop() {
        int opt = -1;
        if (!isEmpty()) {
            opt = info[size - 1];
            size--;
        } else {
            System.out.println("Stack is Empty");
        }
        return opt;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
    
    public String toString(){
        return Arrays.toString(info);
    }
}