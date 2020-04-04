package quiz;

import java.util.Scanner;

public class Quiz_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[][] mat = new int[n1][n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println(Quiz_46.det(mat));
    }

    public static int det(int[][] mat) {
        if(mat.length == 1){
            return mat[0][0];
        }
        if (mat.length == 2) {
            return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
        } else {
            int sum = 0;
            for (int i = 0; i < mat.length; i++) {
                int cofac = 0;
                if (i % 2 == 0) {
                    cofac = 1 * mat[0][i];
                } else {
                    cofac = -1 * mat[0][i];
                }
                // 00 01 02 00 01
                // 10 11 12 10 11
                // 20 21 22
                int[][] temp = new int[mat.length - 1][mat.length - 1];
                for (int r = 0; r < temp.length; r++) {
                    for (int c = 0; c < temp.length; c++) {
                        if (c >= i) {
                            temp[r][c] = mat[r + 1][c + 1];
                        } else {
                            temp[r][c] = mat[r + 1][c];
                        }

                    }
                }
                sum += cofac * det(temp);

            }
            return sum;
        }

    }
}