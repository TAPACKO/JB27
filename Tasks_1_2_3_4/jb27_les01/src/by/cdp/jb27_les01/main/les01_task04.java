package by.cdp.jb27_les01.main;

public class les01_task04 {
	public static void main(String[] args) {
		double a; // катет #1
		double b; // катет #2
		double c; // гипотенуза
		double p; // периметр
		a = 3;
		b = 4;
		c = 0;
		p = 0;

		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		p = a * b * 0.5;
				System.out.println(
						"Гипотенуза = " + c
						+ "\n" + 
						"Площадь = " + p
						);
		}

}