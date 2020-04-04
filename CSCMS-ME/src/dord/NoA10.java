package dord;

import java.util.Scanner;

public class NoA10 {
    public static void main(String[] args) {
        char[] con = new char[26];
        int index = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            con[index] = i;
            index++;
        }
        String[] con2 = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine()+ " ";
        sc.close();
        while (str.contains(" ")) {
            int temp = 0;
            for (int j = 0; j < con2.length; j++) {
                if (str.charAt(j) == ' ') {
                    break;
                }
                temp++;
            }
            for (int i = 0; i < con2.length; i++) {                
                if (str.substring(0, temp).equals(con2[i])) {
                    System.out.print(con[i]);
                    str = str.replaceFirst(con2[i]+" ", "");
                    break;
                }
            }
        }
    }
}