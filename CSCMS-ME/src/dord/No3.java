package dord;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine().toLowerCase(), str2 = sc.next().toLowerCase();
        sc.close();
        switch (str){
            case "rock":{
                switch (str2){
                    case "rock": System.out.println("Draw"); break;
                    case "paper": System.out.println("Dr.Worarat Krathu"); break;
                    case "scissors": System.out.println("Mr.Ukrit Ruckcharti"); break;
                } break;
            }
            case "paper":{
                switch (str2){
                    case "rock": System.out.println("Mr.Ukrit Ruckcharti"); break;
                    case "paper": System.out.println("Draw"); break;
                    case "scissors": System.out.println("Dr.Worarat Krathu"); break;
                } break;
            }
            case "scissors":{
                switch (str2){
                    case "rock": System.out.println("Dr.Worarat Krathu"); break;
                    case "paper": System.out.println("Mr.Ukrit Ruckcharti"); break;
                    case "scissors": System.out.println("Draw"); break;
                } break;
            }
        }
    }
    

}