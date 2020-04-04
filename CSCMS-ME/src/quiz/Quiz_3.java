package quiz;
import java.util.Scanner;
public class Quiz_3 {

	public static void main(String[] args) {
		int fac = new Scanner (System.in).nextInt();
		long sum = 1;
		for(int i = 1; i<= fac;i++) {
			sum *= i;
		}
		System.out.println(sum);
	}

}
