package ps021_030;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ps027 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] arr = new String[3];

		StringTokenizer st = new StringTokenizer(date,".");
		
		int i = 0;
		while(st.hasMoreTokens()) {
			arr[i] = st.nextToken();
			i = i+1;
		}
		
		System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);
	}

}
