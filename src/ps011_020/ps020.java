package ps011_020;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ps020 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		String id = sc.next();
		
//		String front = "";
//		String back = "";
//		
//		boolean isFront = true;
//		for(int i = 0; i < id.length(); i++) {
//			if(id.charAt(i) == '-') {
//				isFront = false;
//			}else if(isFront) {
//				front+= id.charAt(i); 
//			}else {
//				back+=id.charAt(i);
//			}
//		}
//		
//		------------------------------------
		
//		int index = id.indexOf("-");
//		// 110011-0000000; 
//		front = id.substring(0, index);
//		back = id.substring(index + 1, id.length());
//		
//		System.out.println(front + back);
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		
			
		StringTokenizer st = new StringTokenizer(id, "-");

		String result="";

		while(st.hasMoreTokens()) {
			result+=st.nextToken();
		};
		

		System.out.println(result);

	}

}
