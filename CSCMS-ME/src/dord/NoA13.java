package dord;

import java.util.Scanner;

public class NoA13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        sc.close();
        System.out.println(multiply(n1, n2));
    }

    public static int multiply(int n1, int n2){
        if(n2 == 1){
            return n1;
        } else {

            return n1 + multiply(n1, n2-1);
        }
    }
}