package ps081_090;

import java.util.Scanner;

public class ps090 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long r = sc.nextInt();
		long n = sc.nextInt();

		long result = a;

		for (int i = 1; i < n; i++) {
			result *= r;
		}

		System.out.println(result);

	}

}
