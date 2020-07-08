package ps081_090;

import java.util.Scanner;

public class ps086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		
		double div = 8*1024*1024;
		
		System.out.format("%.2f MB", w*h*b/div);
	}

}
