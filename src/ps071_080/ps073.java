package ps071_080;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ps073 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		StringTokenizer st = new StringTokenizer(num, " ");

		int arr[] = new int[st.countTokens()];

		int i = 0;
		while (st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i += 1;
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
				break;
			}
			System.out.println(arr[j]);
		}

	}

}
