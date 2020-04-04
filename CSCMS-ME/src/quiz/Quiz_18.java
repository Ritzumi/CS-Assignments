package quiz;

import java.util.Scanner;
import java.util.TreeSet;

public class Quiz_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.close();
        System.out.println(calculation(target));

    }

    public static int calculation(int target) { // num = 1, count = 1
        int count = 0;
        if(target % 2 == 1){
            target--;
            count++;
        }
        while(target % 2 == 0){
            target /= 2;
        }
        TreeSet<Integer> result = new TreeSet<>();
        for (int i = 1; i <= Math.sqrt(target); i++) {
            calculationInner(result, target, i, i);
        }
        return result.first()+ count;
    }

    public static void calculationInner(TreeSet<Integer> result, int target, int num, int count) {
        if (target < num) {
            result.add(target);
        } else if (target == num) {
            result.add(count);
        } else {
            for (int i = 0; i <= Math.sqrt(target - num); i++) {
                if(num*2+i > target){
                    break;
                } else {
                    calculationInner(result, target, num * 2 + i, count + i);
                }

            }
        }
    }

}