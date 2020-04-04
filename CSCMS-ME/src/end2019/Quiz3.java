package end2019;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[sc.nextInt()][sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            String temp = sc.nextLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = temp.charAt(j);
            }
        }
        sc.close();
        int[][] res = new int[arr.length][arr[0].length];
        for (int i = 0; i < res.length; i++) {
            Arrays.fill(res[i], 0);
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (arr[i][j] == 'S') {
                    for (int row = i; row < res.length; row++) {
                        if (arr[row][j] == 'X') {
                            break;
                        }
                        res[row][j] += 1;
                    }
                    for (int row = i - 1; row >= 0; row--) {
                        if (arr[row][j] == 'X') {
                            break;
                        }
                        res[row][j] += 1;
                    }
                    for (int col = j+1; col < res[0].length; col++) {
                        if (arr[i][col] == 'X') {
                            break;
                        }
                        res[i][col] += 1;
                    }
                    for (int col = j - 1; col >= 0; col--) {
                        if (arr[i][col] == 'X') {
                            break;
                        }
                        res[i][col] += 1;
                    }
                }
            }
        }
    for (int i = 0; i < res.length; i++) {
        for (int j = 0; j < res[0].length; j++) {
            System.out.print(res[i][j] + " ");
        }
        System.out.println();
    }
    }
}