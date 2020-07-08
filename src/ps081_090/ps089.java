package ps081_090;

import java.util.Scanner;

public class ps089 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		int result = a;
		for (int i = 0; i < n-1; i++) {
			result += d;
		}

		System.out.println(result);

	}

}
