package by.cdp.jb27_les03.main;

import java.util.Scanner;

	public class les03_task01_1 {
		public static void main(String[] args) {
			int n = 4;
			Scanner sc = new Scanner(System.in);
			String max = "", min = "", str = "";
			for (int i = 0; i < n; i++) {
			System.out.print("> ");
			if (sc.hasNextLine()) {
			str = sc.nextLine();
			if (i == 0) {
			min = str;
			}
			if (str.length() > max.length()) {
			max = str;
			} else if (str.length() < min.length()) {
			min = str;
			}
			}
			}
			message(max,min);
			//System.out.println("max string = " + max + " length=" + max.length());
			//System.out.println("min string = " + min + " length=" + min.length());
			}
		
public static void message(String max,String min) {
	System.out.println("max string = " + max + " length=" + max.length());
	System.out.println("min string = " + min + " length=" + min.length());
	}	
		
}