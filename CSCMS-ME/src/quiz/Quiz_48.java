package quiz;

import java.util.Scanner;

public class Quiz_48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		String s4 = sc.next();
		boolean MuR = false, DnD = false;
		if (s1.equals("1"))
			MuR = true;
		if (s2.equals("1"))
			DnD = true;
		if (s3.equals("1")) {
			if (MuR) {
				MuR = false;
			} else {
				MuR = true;
				DnD = true ? false : DnD;
			}
		}
		if (s4.equals("1")) {
			if (DnD) {
				DnD = false;
			} else {
				DnD = true;
				MuR = true ? false : MuR;
			}
		}
		System.out.println(DnD ? "DnD" : MuR ? "MuR" : "NEUTRAL");
	}

}