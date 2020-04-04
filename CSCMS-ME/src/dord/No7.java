package dord;

import java.util.Scanner;
public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double max = 0, min = 0, sum = 0, average = 0;
        for (int i = 0; i < count; i++) {
            double temp = sc.nextDouble();
            if(i == 0){
                max = temp;
                min = temp;
                sum = temp;
                average = temp;
            }
            else {
                max = temp > max ? temp : max;
                min = temp < min ? temp : min;
                sum += temp;
                average += temp;
            }
        }
        sc.close();
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + average/count);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}