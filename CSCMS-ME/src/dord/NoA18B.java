package dord;

import java.util.HashSet;
import java.util.Scanner;

public class NoA18B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] out = new int[sc.nextInt()];
        for (int i = 0; i < out.length; i++) {
            out[i] = sc.nextInt();
        }
        sc.close();
        subOfSum(arr, out);
    }

    public static void subOfSum(int[] arr, int[] out) {
       HashSet<Integer> result = new HashSet<Integer>();
        boolean[] isPicked = new boolean[arr.length];
        int temp = 0;
        Cruelty(arr, out, result, temp, isPicked);
        // for (int i = 0; i < isTrue.length; i++) {
        //     if (isTrue[i]) {
        //         System.out.println("Yes");
        //     } else {
        //         System.out.println("No");
        //     }
        // }
        for (int i = 0; i < out.length; i++) {
            if(result.contains(out[i])){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
        System.out.println(result);
    }

    public static void Cruelty(int[] arr, int[] out, HashSet<Integer> result, int temp, boolean[] isPicked) {
        boolean isRun = false;
        for (int i = 0; i < isPicked.length; i++) {
            if (isPicked[i] == false) {
                isRun = true;
                break;
            }
        }
        if (!isRun) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (isPicked[i] == false) {
                isPicked[i] = true;
                result.add(arr[i] +temp);
                // Checker(temp + arr[i], out, isTrue);
                Cruelty(arr, out, result, temp + arr[i], isPicked.clone());

            }
        }
    }

    // public static void Checker(int temp, int[] out, boolean[] isTrue) {
    //     for (int i = 0; i < out.length; i++) {
    //         if (temp == out[i]) {
    //             isTrue[i] = true;
    //         }
    //     }
    // }
}