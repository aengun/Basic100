package ps081_090;

import java.util.Scanner;

public class ps085 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();

		double div = 8*(2<<9)*(2<<9);
//		double total = 0;
//		if (0 < h && h <= 48000 
//				&& 0 < b && b <= 32 && b % 8 == 0 
//				&& 0 < c && c <= 5 
//				&& 0 < s && s <= 6000) {
//			total = h * b * c * s;
//		}
		
		double result = h*b*c*s/div;
		
		System.out.format("%.1f MB", result);
	}

}
