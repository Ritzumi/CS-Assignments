package quiz;

import java.util.Scanner;

public class Quiz_52_Refined {
	public static void main(String[] args) {
		char str[] = new Scanner(System.in).nextLine().toCharArray();
		char str2[] = new char[str.length];
		int length = str.length;
		for (int i = 0; i < length / 2; i++) {
			str2[i] = str[length / 2 - 1 - i];
			if (str.length % 2 == 0)
				str2[length / 2 + i] = str[length - 1 - i];
			if (str.length % 2 == 1)
				str2[length / 2 + i + 1] = str[length - 1 - i];
		}
		if (str.length % 2 == 1)
			str2[length / 2] = str[length / 2];

		for (char i : str2)
			System.out.print(i);
	}

}
