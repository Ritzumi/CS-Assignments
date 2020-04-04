package end2019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Quiz_2_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = 0; i < n1+n2; i++) {
             hs.add(sc.nextInt());
             if(i >= n1){
                 arr.add(sc.nextInt());
             }
        }
        for (Integer integer : hs) {
            LinkedHashSet<Integer> temp = new LinkedHashSet<>(arr);
            temp.forEach(s -> s-=integer);
            
        }


        hs.forEach(s -> s-=5);
    }
}