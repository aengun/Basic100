package ps071_080;

import java.util.Scanner;

public class ps075 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println(num - i - 1);
		}

	}

}