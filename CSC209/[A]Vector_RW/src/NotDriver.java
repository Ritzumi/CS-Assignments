import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NotDriver {

    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("text.txt", "rw");
            raf.writeInt(13);
            raf.writeInt(56);
            raf.writeInt(64);
            raf.writeInt(200);
            raf.writeInt(14);
            raf.writeInt(88);
            raf.writeInt(91);
            raf.writeInt(12);

            Vector<Integer> vec = new Vector<>();
            raf.seek(0);
            for (int i = 0; i < raf.length() / 4; i++) {
                int temp = raf.readInt();
                if (vec.isEmpty()) {
                    vec.add(temp);
                } else {
                    for (int j = 0; j < vec.size();) {
                        if (temp < vec.get(j)) {
                            vec.insertElementAt(temp, j);
                            break;
                        } else {
                            vec.add(temp);
                            break;
                        }
                    }
                    System.out.println(vec);
                }

            }

            raf.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(NotDriver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NotDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}