import javax.swing.*;
import java.awt.*;

public class XYPanel extends javax.swing.JPanel {
    private JPanel panel1;
    int[][] p;
    int[] pair;

    public XYPanel(int[][] points, int[] cloestPair){
            this.p = points;
            this.pair = cloestPair;
        }

    public void paintComponent(Graphics page){
        for (int[] ints : p) {
            page.drawOval(ints[0]-5, ints[1]-5, 10, 10);
        }
        page.setColor(Color.blue);
        page.drawLine(   p[pair[0]][0],p[pair[0]][1]
                        ,p[pair[1]][0],p[pair[1]][1]);
    }
}
