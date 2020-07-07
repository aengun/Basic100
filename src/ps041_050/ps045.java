package ps041_050;

import java.util.Scanner;

public class ps045 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		float a2 = (float) a;
		float b2 = (float) b;

		float c = (float) (a2 / b2);
		String d = String.format("%.2f", c);
		System.out.println(d);

	}

}
