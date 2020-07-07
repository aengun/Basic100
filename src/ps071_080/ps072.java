package ps071_080;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ps072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		
		String num = sc.nextLine();
		String nums = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(nums," ");
		
		String arr[] = new String[Integer.parseInt(num)];
		
		int i = 0;
		while(st.hasMoreTokens()) {
			arr[i] = st.nextToken();
			i+=1;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.println(Integer.parseInt(arr[j]));
		}

	}

}
