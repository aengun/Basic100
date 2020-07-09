package ps091_100;

import java.util.Scanner;

public class ps095 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		int arr2[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		int min = 9999;
		int tmp = 0;
		
		for(int i = 0 ; i <arr2.length;i++) {
			if(arr2[i]<min) {
				tmp = min;
				min = arr2[i];
				arr2[i] = tmp;
			}
		}
		
		System.out.println(min);

	}

}
