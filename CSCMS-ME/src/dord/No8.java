package dord;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num <= 7) {
            System.out.println(num);
            return;
        }
        String str = "";
        while (num > 0) {
            str += "" + num % 8;
            num /= 8;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}