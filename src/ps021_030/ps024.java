package ps021_030;

import java.util.Scanner;

public class ps024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		char[] tca = sentence.toCharArray();

		for (int i = 0; i < tca.length; i++) {
			System.out.println("'" + tca[i] + "'");

		}
	}

}
