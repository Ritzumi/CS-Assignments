import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import java.io.RandomAccessFile;

public class ReadWriteVector {
    private final String filesrc = "File\\vector.data";

    public static void main(String[] args) {
        // Support Integer number
        // Remove old file when you run again
        ReadWriteVector m = new ReadWriteVector();
        Vector<Integer> OldPos = new Vector<>();
        Vector<Integer> SortedPos = new Vector<>();
        Vector<Integer> vec = new Vector<>();
        m.writeNum(OldPos, 5);
        m.writeNum(OldPos, 10);
        m.writeNum(OldPos, 50);
        m.writeNum(OldPos, 15);
        m.writeNum(OldPos, 2000);
        m.writeNum(OldPos, 300);
        for (Integer integer : OldPos) {
            int t = m.readNum(integer);
            m.addToVector(vec, t);
            SortedPos.insertElementAt(integer, vec.indexOf(t));
        }
        System.out.println("Unsorted Position = " + OldPos);
        System.out.println("Sorted Position = " + SortedPos);
        System.out.println(vec);

    }

    public void addToVector(Vector<Integer> vec, int num) {
        if (vec.size() == 0) {
            vec.add(num);
            return;
        } else {
            for (Integer integer : vec) {
                if (num < integer) {
                    vec.insertElementAt(num, vec.indexOf(integer));
                    return;
                }
            }
            vec.add(num);
        }
    }

    public void writeNum(Vector<Integer> pos, int num) {
        try {
            RandomAccessFile raf = new RandomAccessFile(filesrc, "rw");
            raf.seek(raf.length());
            pos.add((int) raf.getFilePointer()); // getilePointer
            raf.writeInt(num);
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public int readNum(int pos) {
        try {
            RandomAccessFile raf = new RandomAccessFile(filesrc, "r");
            raf.seek(pos);
            int temp = raf.readInt();
            raf.close();
            return temp;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}