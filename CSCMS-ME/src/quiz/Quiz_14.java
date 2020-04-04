package quiz;

import java.util.Scanner;

public class Quiz_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        sc.close();
        int year = n1 / (60 * 24 * 365);
        int day = (n1 % (60 * 24 * 365)) / (60 * 24);
        System.out.println(year + " " + day);
    }
}