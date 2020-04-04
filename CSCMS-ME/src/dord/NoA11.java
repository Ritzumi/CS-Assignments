package dord;

import java.util.Scanner;

public class NoA11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        sc.close();
        for (int i = 0; i < n1 + 1; i++) {
            for (int j = 0; j < n2 * 2 + 1; j++) {
                if (i == 0) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("_");
                    }
                } else if (j % 2 == 0 && i != 0) {
                    System.out.print("|");
                } else if (j % 2 == 1 && i != 0) {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}