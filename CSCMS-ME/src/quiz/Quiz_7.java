package quiz;

import java.util.Scanner;

public class Quiz_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j <n2 ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}