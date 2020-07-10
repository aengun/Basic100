package ps091_100;

import java.util.Scanner;

public class ps098 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int num = sc.nextInt();

		int arr[][] = new int[h + 1][w + 1];
		int l, d, x, y;

		for (int i = 0; i < num; i++) {
//			String str = sc.nextLine();
//			String[] arr2 = str.split(" ");
//			l = Integer.parseInt(arr2[0]);
//			d = Integer.parseInt(arr2[1]);
//			x = Integer.parseInt(arr2[2]);
//			y = Integer.parseInt(arr2[3]);
			l = sc.nextInt();
			d = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();

			for (int j = 0; j < l; j++) {
				if (d == 1) {
					arr[x + j][y] = 1;
				} else {
					arr[x][y + j] = 1;
				}
			}
		}

		for (int i = 1; i < h + 1; i++) {
			for (int j = 1; j < w + 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
