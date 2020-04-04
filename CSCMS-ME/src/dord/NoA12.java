package dord;

import java.util.Scanner;

public class NoA12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int arr[][] = new int[n2][n1];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }

        
    }
}