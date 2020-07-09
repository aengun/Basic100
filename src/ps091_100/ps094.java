package ps091_100;

import java.util.Scanner;

public class ps094 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.nextLine();
		String arr[] = str.split(" ");

		for (int i = 1; i < num; i++) {
			System.out.print(arr[arr.length-i]+" ");
		}

	}

}
