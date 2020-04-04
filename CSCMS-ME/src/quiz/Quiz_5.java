package quiz;
import java.util.Scanner;
public class Quiz_5 {

	public static void main(String[] args) {
		long in = new Scanner(System.in).nextLong();
		if (in == 1) {
			System.out.println("No");
			return;
		}
		for(int i = 2; i <= Math.sqrt(in); i++ ) {
			if(in%i == 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

	}

}
