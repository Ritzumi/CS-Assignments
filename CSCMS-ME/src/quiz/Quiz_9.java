package quiz;

import java.util.Scanner;

public class Quiz_9{
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            sc.close();
            if((n1 <= 2 && n2 <= 2) || (n1 == 3 && n2 == 2) ){
                System.out.println("DIE");
                System.exit(0);
            }
            for (int i = 1; i <= n1; i++) {
                if(i != n2-1 && i != n2 && i != n2+1){
                        System.out.print(i+ " ");
                }
            }
        }
}