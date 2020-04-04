package quiz;

import java.util.Scanner;

public class Quiz_21 {
    public static void main(final String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        for (int i = 0, j = 0; i < num; j++) {
            System.out.print("*");
            if(j == i){
                i++;
                j = -1;
                System.out.println();
            }
        }
    }
}