package quiz;
import java.util.Scanner;
public class Quiz_4 {

	public static void main(String[] args) {
		int square = new Scanner (System.in).nextInt();
		for(int i = 0; i < square; i++) {
			for(int j= 0; j <square; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
