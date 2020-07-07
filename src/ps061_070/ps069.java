package ps061_070;

import java.util.Scanner;

public class ps069 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char alphabet = sc.nextLine().charAt(0);

		if (alphabet == 'A') {
			System.out.println("best!!!");
		} else if (alphabet == 'B') {
			System.out.println("good!!");
		} else if (alphabet == 'C') {
			System.out.println("run!");
		} else if (alphabet == 'D') {
			System.out.println("slowly~");
		} else {
			System.out.println("what?");
		}

	}

}
