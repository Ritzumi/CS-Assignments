package dord;
import java.util.Arrays;
import java.util.Scanner;

public class NoA16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()*2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        sc.close();
        for (int i = 0; i < arr.length; i+=2) {
            char[] temp1 = arr[i].toCharArray();
            char[] temp2 = arr[i+1].toCharArray();
            Arrays.sort(temp1);
            Arrays.sort(temp2);
            if(Arrays.equals(temp1, temp2)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}