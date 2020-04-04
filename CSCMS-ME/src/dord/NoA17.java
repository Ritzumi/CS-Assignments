package dord;

import java.util.Scanner;

public class NoA17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(noLower(str));

    }

    public static String noLower(String str) {
        if (str.length() == 1) {
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                return "" + str.charAt(0);
            } else {
                return "";
            }
        } else {
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                return "" + str.charAt(0) + noLower(str.substring(1));
            } else {
                return "" + noLower(str.substring(1));
            }
        }
    }
}