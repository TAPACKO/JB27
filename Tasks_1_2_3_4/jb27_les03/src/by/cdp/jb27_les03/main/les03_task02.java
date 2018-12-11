package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class les03_task02 {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double h = 0;
		double i = 0;
		Scanner in = new Scanner (System.in);
		
		System.out.print("Введите значение a: ");
		while(!in.hasNextDouble()) {
			System.out.print("Неверный формат" + "\n" + "Введите a: ");
			in.next();}
		a = in.nextDouble();
		
		System.out.print("Введите значение b: ");
		while(!in.hasNextDouble()) {
			System.out.print("Неверный формат" + "\n" + "Введите b: ");
			in.next();}
		b = in.nextDouble();
		
		System.out.print("Введите значение h: ");
		
		while(!in.hasNextDouble()) {
			System.out.print("Неверный формат" + "\n" + "Введите h: ");
			in.next();}
		h = in.nextDouble();
	
		for (i = a; i <= b; i = i + h) {
			//System.out.println("|  F(" + i + ")  |" + func(i) + "");
			System.out.format("\n" + "%32s%10s", "|  F(" + i + ")=  |", func(i) + "  |");
		}
	}

	public static double func(double x) {
				double result = 0;
		result = (2 * Math.tan(x/2)) + 1;		
		return Math.round(result * 100.0) / 100.0;
		
			}

}
