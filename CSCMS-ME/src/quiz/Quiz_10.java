package quiz;

import java.util.Scanner;

public class Quiz_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt(), str = sc.nextInt();
        sc.close();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < str; j++) {
                if((i > 0 && i < line -1 ) && (j > 0 && j < str-1)){
                    System.out.print("-");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}