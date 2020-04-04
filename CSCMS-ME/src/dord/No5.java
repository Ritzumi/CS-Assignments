package dord;
import java.util.Scanner;
public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        sc.close();
        if(n1> n2){
            System.out.println("Not enough money.");
        } else if (n1 == n2){
            System.out.println("No change for you.");
        } else {
            int change  =(n2-n1);
            System.out.println("Change: " + change);
            System.out.println("1000THB: " + (change/1000));
            change %= 1000;
            System.out.println("500THB: " + (change/500));
            change %= 500;
            System.out.println("100THB: " + (change/100));
            change %= 100;
            System.out.println("50THB: " + (change/50));
            change %= 50;
            System.out.println("20THB: " + (change/20));
            change %= 20;
            System.out.println("10THB: " + (change/10));
            change %= 10;
            System.out.println("5THB: " + (change/5));
            change %= 5;
            System.out.println("2THB: " + (change/2));
            change %= 2;
            System.out.println("1THB: " + change);
        }
    }
}