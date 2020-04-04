package quiz;

import java.util.Scanner;

public class Quiz_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        char ch = sc.next().toLowerCase().charAt(0);
        sc.close();
        int count = 0;
        String index = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                index += i + ", ";
            }
        }
        if (count == 0) {
            System.out.println("ERROR");
            return;
        } else {
            System.out.println(count);
            System.out.println(index.substring(0, index.length() - 2));
        }
    }
}