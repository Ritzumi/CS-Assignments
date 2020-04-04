package quiz;

import java.util.Scanner;

public class Quiz_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.next();
		if (s1.length() >= s2.length()) {
			s1 = s1.replaceAll(s2, "");
			System.out.println(s1);
		} else {
			s2 = s2.replaceAll(s1, "");
			System.out.println(s2);
		}

	}

}
