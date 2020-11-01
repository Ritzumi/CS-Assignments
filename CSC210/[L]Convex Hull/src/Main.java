import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {80,90},
                {200,150},
                {150,300},
                {100,50},
                {500,180},
                {250,120},
                {80,240},
                {100,150},
                {400,360},
                {50,190},
                // 9 100
                //200 400
                //300 400
                //300 300
                //400 300
                //400 400
                //500 400
                //500 200
                //350 200
                //200 200
//                {2,5},
//                {3,4},
//                {4,8},
//                {1,5},
//                {4,1}
//                {9,100},
//                {200,400},
//                {300,400},
//                {300,300},
//                {400,300},
//                {400,300},
//                {400,400},
//                {500,400},
//                {500,200},
//                {350,200},
//                {200,200}

        };
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int a, b, c;
            for (int j = i+1; j < arr.length; j++) {
                a = arr[j][1] - arr[i][1];
                b = arr[i][0] - arr[j][0];
                c = arr[i][0]*arr[j][1] - arr[j][0]*arr[i][1];
                int lessThanC = 0, moreThanZ = 0;
                for (int k = 0; k < arr.length; k++) {
                    if (k != i & k !=j){
                        if (a * arr[k][0] + b * arr[k][1] == c);
                        else if (a*arr[k][0] + b*arr[k][1] < c){
                            lessThanC++;
                        } else {
                            moreThanZ++;
                        }
                    }
                }
                if (lessThanC*moreThanZ == 0){
                    int[] temp = {arr[i][0], arr[i][1], arr[j][0], arr[j][1]};
                    result.add(temp);
                }
            }
        }

        for (int[] i:
             result) {
            System.out.println(Arrays.toString(i));
        }

        JFrame frame = new JFrame("Convex_Hull");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        XYPanel panel = new XYPanel(arr, result);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }


}
