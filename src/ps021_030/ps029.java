package ps021_030;

import java.util.Scanner;

public class ps029 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		sc.close();
		String num = String.format("%.11f", number);
		System.out.println(num);

	}

}
