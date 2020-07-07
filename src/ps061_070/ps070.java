package ps061_070;

import java.util.Scanner;

public class ps070 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int season = sc.nextInt();

		if (season == 12 || season == 1 || season == 2) {
			System.out.println("winter");
		} else if (season == 3 || season == 4 || season == 5) {
			System.out.println("spring");
		} else if (season == 6 || season == 7 || season == 8) {
			System.out.println("summer");
		} else if (season == 9 || season == 10 || season == 11) {
			System.out.println("fall");
		}

	}

}
