package ps011_020;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ps019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();

		StringTokenizer st = new StringTokenizer(date, ".");

		int arr[] = new int[st.countTokens()];

		int i = 0;

		while (st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i+=1;
		}
		
		String year = String.format("%04d", arr[0]);
		String month = String.format("%02d", arr[1]);
		String day = String.format("%02d", arr[2]);
		
		System.out.println(year+"."+month+"."+day);

	}

}
