package ps091_100;

import java.util.Scanner;

public class ps091 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long m = sc.nextInt();
		long d = sc.nextInt();
		long n = sc.nextInt();
		
		long result = a;
		
		for(int i = 1;i <n;i++) {
			result = result*m+d;
		}
		
		System.out.println(result);

	}

}
