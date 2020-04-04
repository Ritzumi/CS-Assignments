package dord;

import java.util.Scanner;
import java.util.Arrays;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        sc.close();
        char[] con = new char[26];
        int index = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            con[index] = i;
            index++;
        }
        String[] con2 = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
        ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] chr = input.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if(chr[i] == ' '){
                System.out.print("/" + " ");
            } else {
            System.out.print(con2[Arrays.binarySearch(con, chr[i])] + " ");
            }
        }
    }
}