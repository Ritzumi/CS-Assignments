package dord;

import java.util.Scanner;

public class NoA14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        sc.close();
        System.out.println(sum(str));
    }

    public static int sum(String str){
        if(str.length() == 1){
            return Integer.valueOf(str);
        } else {
            return Integer.valueOf(str.substring(0,1)) + sum(str.substring(1));
        }
    }
}