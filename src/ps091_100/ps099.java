package ps091_100;

import java.util.Scanner;

public class ps099 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[10][10];
		// �迭 �Է�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int k = sc.nextInt();
				arr[i][j] = k;
			}
		}

		boolean isReached = false;

		int n = 1, m = 1;

		while (!isReached) {
			if (arr[n][m] == 2) { //[1][1]
				arr[n][m] = 9;
				break;
			}
			
			if (arr[n][m + 1] == 1) { // �������� ������
				if (arr[n + 1][m] == 1) { // �ؿ��� ������
					break;
				}
				n++;
			} else if (arr[n][m + 1] != 1) { // �������� ������ ������
				m++;
			}
			
			if (arr[n][m] == 2) { //[1][1]
				arr[n][m] = 9;
				break;
			}
			
			arr[n][m] = 9;
		}

		arr[1][1] = 9;

		// �迭 ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
