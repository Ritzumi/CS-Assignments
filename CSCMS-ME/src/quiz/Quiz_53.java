package quiz;

import java.util.Scanner;

public class q53_airplane {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		airplane left = new airplane(length);
		airplane right = new airplane(length);
		for (int i = 0; i < length * 2; i++) {
			if (left.weight <= right.weight && left.pos < length)
				left.addPassenger(sc.nextInt());
			else if (left.weight > right.weight && right.pos < length)
				right.addPassenger(sc.nextInt());
			else if (left.weight <= right.weight && left.pos == length) {
				right.addPassenger(left.findPassenger()[0]);
				int n = left.findPassenger()[1];
				left.removePassenger(n);
				left.addPassenger(sc.nextInt(), n);
			} else if (left.weight > right.weight && right.pos == length) {
				left.addPassenger(right.findPassenger()[0]);
				int n = right.findPassenger()[1];
				right.removePassenger(n);
				right.addPassenger(sc.nextInt(), n);
			}
		} for (int i = 0; i < length; i++) {
			System.out.println(left.row[i] + " " + right.row[i]);
		}
	}

}

class airplane {
	int[] row;
	int pos, weight;

	airplane(int r) {
		row = new int[r];
	}

	int[] findPassenger() {
		int[] ValPos = new int[2];
		ValPos[0] = row[0];
		ValPos[1] = 0;
		for (int i = 1; i < row.length; i++) {
			if (row[i] <= ValPos[0]) {
				ValPos[0] = row[i];
				ValPos[1] = i;
			}
		}
		return ValPos;
	}

	void removePassenger(int p) {
		weight -= row[p];
		row[p] = 0;
	}

	void addPassenger(int in) {
		row[pos] = in;
		weight += in;
		pos++;
	}

	void addPassenger(int in, int pos) {
		row[pos] = in;
		weight += in;
	}
}