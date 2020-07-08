package ps071_080;

import java.util.Scanner;

public class ps076 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		
		for (int i = 97; i <= ch; i++) {
			char c = (char) i;
			System.out.println(c);
		}

	}

}
