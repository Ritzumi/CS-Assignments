package quiz;

import java.util.Scanner;

public class Quiz_52 {

	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		char[] arr = str.toCharArray();
		String str2 = "";
		if (arr.length < 4) {
			System.out.println(str);
		} else if (arr.length % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				if (i == ((arr.length - 1) / 2)) {
					str2 += arr[i];
				} else if (i < (arr.length - 1) / 2) {
					str2 += arr[(arr.length - 3) / 2 - i];
				} else {
					str2 += arr[arr.length - ( ((i- (arr.length - 1) / 2)))];
				}
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if(i<arr.length/2) {
					str2 += arr[arr.length/2-1-i];
				} else {
					str2 += arr[arr.length -1 -(i - arr.length/2)];
				}
			}
		}
		System.out.println(str2);
	}
}
