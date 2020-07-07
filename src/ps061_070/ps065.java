package ps061_070;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ps065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		StringTokenizer st = new StringTokenizer(a, " ");

		int arr[] = new int[st.countTokens()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
