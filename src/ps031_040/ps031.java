package ps031_040;

import java.util.Scanner;

public class ps031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String newnum = String.format("%o", num);
		
		System.out.println(newnum);
	}

}
