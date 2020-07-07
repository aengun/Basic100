package ps021_030;

import java.util.Scanner;

public class ps025 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int arr[] = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = (int) ((int) (num / (Math.pow(10, 4 - i))) * (Math.pow(10, 4 - i)));
			num -= arr[i];
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("["+arr[i]+"]");
		}

	}

}
