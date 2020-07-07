package ps021_030;

import java.util.Scanner;

public class ps026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		
		int minute = Integer.parseInt(time.split(":")[1]);
		
		System.out.println(minute);

	}

}
