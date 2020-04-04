package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length / 2; i++)
			System.out.print(arr[arr.length - 1 - i] + " " + arr[i] + " ");
		if (arr.length % 2 == 1)
			System.out.print(arr[arr.length / 2]);
	}

}
