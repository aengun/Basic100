package ps081_090;

import java.util.Scanner;

public class ps087 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = 0;
		for (int i = 0; i < num; i++) {
			if(num == 1) {
				System.out.println(1);
				break;
			}
			
			result += i;
			if(result >= num) {
				System.out.println(result);
				break;
			}
		}

	}

}
