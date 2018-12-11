package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class les03_task03 {
	public static void main(String[] args) {
		double x = 0;

		Scanner in = new Scanner (System.in);
		
		System.out.print("Введите значение x: ");
		while(!in.hasNextDouble()) {
			System.out.print("Неверный формат" + "\n" + "Введите x: ");
			in.next();}
		x = in.nextDouble();
		if (3>x && x>-3) {
			System.out.println("для x=" + x + " функция не имеет решения");	
			return;
		}
		if (x > 3) {
			System.out.println("F(" + x + ")=" + func1(x));
		}
		else {
			System.out.println("F(" + x + ")= 9" );
		}
	}
	public static double func1(double a) {
		double func = 0;
		func = 1 / (Math.pow(a,2));
		return func;
	}
}
