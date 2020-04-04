package quiz;

import java.util.Scanner;

public class Quiz_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        sc.close();
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp;
            temp = str.charAt(i) - 'a' + 1;
            if (temp < 1 || temp > 26) {
                continue;
            } else {
                value += (temp - i);
            }
        }
        System.out.println(value);
    }
}