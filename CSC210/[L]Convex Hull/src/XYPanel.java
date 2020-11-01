import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class XYPanel extends javax.swing.JPanel {
    private JPanel panel1;
    int[][] p;
    ArrayList<int[]> point_pairs;

    public XYPanel(int[][] points,ArrayList<int[]> point_pairs){
        this.p = points;
        this.point_pairs = point_pairs;
    }

    public void paintComponent(Graphics page){
        for (int[] ints : p) {
            page.drawOval(ints[0]-5, ints[1]-5, 10, 10);
        }
        page.setColor(Color.blue);
        for (int[] p: point_pairs){
            page.drawLine(p[0], p[1], p[2], p[3]);
        }
    }
}
