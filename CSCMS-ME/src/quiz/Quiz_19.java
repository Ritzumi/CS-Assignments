package quiz;

import java.util.Scanner;

public class Quiz_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] num = new long[sc.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i] = (long) Math.pow(sc.nextInt(), sc.nextInt());
            long mod = sc.nextLong();
            if(num[i] % 2 == 0){
                num[i] = ((num[i]/2) % mod) + ((num[i]/2) % mod);
            } else {
                num[i] = ((num[i]/2 + 1) % mod) + ((num[i]/2) % mod);
            }
        }
        sc.close();
        for (long l : num) {
            System.out.println(l);
        }
    }
}