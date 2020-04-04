package quiz;

import java.util.Scanner;

public class Quiz_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();
        for (int i = 0; i < count; i++) {
            System.out.print(Quiz_6.fibo(i) + " ");

        }
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}