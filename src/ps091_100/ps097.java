package ps091_100;

import java.util.Scanner;

public class ps097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[][] = new int[19][19];

		for (int i = 0; i < 19; i++) {
			String a = sc.nextLine();
			String[] arr2 = a.split(" ");

			for (int j = 0; j < 19; j++) {

				arr1[i][j] = Integer.parseInt(arr2[j]);

			}
		}

		int n1 = sc.nextInt();

		for (int i = 0; i < n1; i++) {
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();

			for (int j = 0; j < 19; j++) {
				if (arr1[n2 - 1][j] == 1) {
					arr1[n2 - 1][j] = 0;
				} else {
					arr1[n2 - 1][j] = 1;
				}
			}

			for (int k = 0; k < 19; k++) {
				if (arr1[k][n3 - 1] == 1) {
					arr1[k][n3 - 1] = 0;
				} else {
					arr1[k][n3 - 1] = 1;
				}
			}
		}

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
