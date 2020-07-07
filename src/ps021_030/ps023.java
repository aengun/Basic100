package ps021_030;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ps023 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String num = sc.nextLine();

		StringTokenizer st = new StringTokenizer(num, ".");

		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
