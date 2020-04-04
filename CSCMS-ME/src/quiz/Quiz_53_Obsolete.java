package quiz;

import java.util.Scanner;

public class q53_obselete_airplane {

	static Seat addWeight(Seat s, int value) {
		s.seat[s.pos] = value;
		s.weight += s.seat[s.pos];
		s.pos++;
		return s;
	}

	static Seat adddWeight(Seat s, int value, int pos) {
		s.seat[pos] = value;
		s.weight += s.seat[pos];
		return s;
	}

	static Seat moveWeight(Seat full, Seat move) {
		move = adddWeight(move, findPassenger(full.seat)[0], findPassenger(full.seat)[1]);
		move.pos++;
		return move;
	}

	static Seat moveWeight_c(Seat full, Seat move) {
		full.weight -= findPassenger(full.seat)[0];
		return full;
	}

	static int[] findPassenger(int[] arr) {
		int[] ValPos = new int[2];
		ValPos[0] = arr[0];
		ValPos[1] = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= ValPos[0]) {
				ValPos[0] = arr[i];
				ValPos[1] = i;
			}
		}
		return ValPos;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Seat left = new Seat(sc.nextInt());
		Seat right = new Seat(left.seat.length);
		int length = left.seat.length;
//		left = new int[sc.nextInt()];
//		right = new int[left.length];

		for (int i = 0; i < length * 2; i++) { // Problem position and weight don't added
			if (left.weight <= right.weight && left.pos < length) {

				left = addWeight(left, sc.nextInt());
//				addWeight(left, sc.nextInt(), left_p, left_w);

			} else if (left.weight > right.weight && right.pos < length) {

				right = addWeight(right, sc.nextInt());
//				addWeight(right, sc.nextInt(), right_p, right_w);

			} else if (left.weight <= right.weight && left.pos == length) {

				right = moveWeight(left, right);
				left = moveWeight(left, right);
//				addWeight(right, findPassenger(left)[0], right_p, right_w);
//				left_w -= findPassenger(left)[0];
//				addWeight(left, sc.nextInt(), findPassenger(left)[1], left_w);

			} else if (left.weight > right.weight && right.pos == length) {

				left = moveWeight(right, left);
//				addWeight(left, findPassenger(right)[0], left_p, left_w);
//				right_w -= findPassenger(right)[0];
//				addWeight(right, sc.nextInt(), findPassenger(right)[1], right_w);

			}
		}
		for (int i = 0; i < length; i++) {
			System.out.println(left.seat[i] + " " + right.seat[i]);
		}

	}
}

class Seat {

	int weight = 0;
	int seat[];
	int pos = 0;

	Seat(int length) {
		seat = new int[length];
	}
}