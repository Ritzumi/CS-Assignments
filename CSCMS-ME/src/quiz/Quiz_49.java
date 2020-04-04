package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_49 {

//	public static void main(String[] args) {
//		String str = new Scanner(System.in).nextLine().toLowerCase();
//		for(int i = 0; i < str.length(); i++) {
//			for(int j = i+1; j< str.length(); j++) {
//				if(str.charAt(i) == str.charAt(j) && 
//				(str.charAt(i) != ' ' && str.charAt(i) != '-')) {
//					System.out.println(str+ " is not an isogram");
//					return;
//				}
//			}
//		}
//		System.out.println(str+ " is an isogram");
//
//	}
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		String str2 = str.toLowerCase();
		char arr[] = str2.toCharArray();
		Arrays.sort(arr);
		for(int i = 0; i < str.length()-1; i++) {
			if(arr[i] == arr[i+1] && (arr[i] != ' ' && arr[i] !='-') ) {
				System.out.println(str+ " is not an isogram");
				return;
			}
		}
		System.out.println(str+ " is an isogram");
	}

}
