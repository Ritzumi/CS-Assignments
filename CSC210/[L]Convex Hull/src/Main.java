import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
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
                {2,5},
                {3,4},
                {4,8},
                {1,5},
                {4,1}
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
//                {200,200},

        };
        Stack<int[]> result = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int a, b, c;
            for (int j = i+1; j < arr.length; j++) {
                a = arr[j][1] - arr[i][1];
                b = arr[i][0] - arr[j][0];
                c = arr[i][0]*arr[j][1] - arr[j][0]*arr[i][1];
                int count1 = 0, count2 = 0;
                for (int k = 0; k < arr.length; k++) {
                    if (k != i & k !=j){
                        if (a*arr[k][0] + b*arr[k][1] < c){
                            count1++;
                        } else {
                            count2++;
                        }
                    }
                }
                if (count1*count2 == 0){
                    int[] temp = {arr[i][0], arr[i][1], arr[j][0], arr[j][1]};
                    result.push(temp);
                }
            }
        }

        for (int[] i:
             result) {
            System.out.println(Arrays.toString(i));
        }
    }
}
