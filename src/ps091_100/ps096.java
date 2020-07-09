package ps091_100;

import java.util.Scanner;

public class ps096 {

	public static void main(String[] args) {
		int arr[][] = new int[19][19];
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x - 1][y - 1] = 1;
		}

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.printf(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
