package ps041_050;

import java.util.Scanner;

public class ps046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int sum = a + b + c;

		System.out.println(sum);

		float af = (float) a;
		float bf = (float) b;
		float cf = (float) c;

		float avg = (af + bf + cf) / 3;
		String avg2 = String.format("%.1f", avg);

		System.out.println(avg2);

	}

}
