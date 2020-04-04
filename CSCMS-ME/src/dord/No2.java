package dord;

import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next().toLowerCase(), str2 = sc.next().toLowerCase();
        sc.close();
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1) + " "
        + str2.substring(0,1).toUpperCase() + str2.substring(1));
    }
}