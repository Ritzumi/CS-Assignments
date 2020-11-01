import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {100,50},
                {200,150},
                {150,300},
                {100,80},
                {500,180},
                {250,120},
                {80,240},
                {100,150},
                {400,360},
                {50,190},
        };


        int[] closetPair = new int[2]; // Index in array
        closetPair = closet(arr);
        System.out.println(Arrays.toString(closetPair));
        JFrame frame = new JFrame("Cloest_Pair");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        XYPanel panel = new XYPanel(arr, closetPair);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static int[] closet(int[][] arr){
        double closetDist = Double.MAX_VALUE;
        int[] closetPair = {-1,-1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                double dist  = Math.pow(arr[i][0] - arr[j][0], 2) + Math.pow(arr[i][1] - arr[j][1],2);
                if (dist <= closetDist){
                    closetPair[0] = i;
                    closetPair[1] = j;
                    closetDist = dist;
                }
            }
        }
        return  closetPair;
    }


}
