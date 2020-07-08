package ps071_080;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ps079 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringTokenizer st = new StringTokenizer(a, " ");
		String arr[] = new String[st.countTokens()];

		int j = 0;
		while (st.hasMoreTokens()) {
			arr[j] = st.nextToken();
			j += 1;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i].equals("q")) {
				break;
			}
		}

	}

}
