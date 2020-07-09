package ps091_100;

import java.util.Scanner;

public class ps093 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String nums = sc.nextLine();
		String arr2[] = nums.split(" ");
		
		int arr[] = new int[24];
		for (int j = 0; j < arr2.length; j++) {
			arr[Integer.parseInt(arr2[j])-1]++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

	}

}
