package by.cdp.jb27_les02.main;

import java.util.Scanner;

public class les02_task03 {
	public static void main(String[] args) {
	//double length = 0;
	//double area = 0;
	double R;
	Scanner in = new Scanner (System.in);
	
	System.out.print("Введитезначение радиуса R: ");
	while(!in.hasNextDouble()) {
		System.out.print("Неверный формат" + "\n" + "Введите R: ");
		in.next();
	}
	R = in.nextDouble();
 
	System.out.println (
			"При R=" + R + ":" + "\n" + 
			"Длина окружности равна " + length(R) + "\n" + 
			"Площадь круга равна " + area(R));
	}	
	public static double length(double r) {
		double len = 0;
		len = 2 * Math.PI * r;
				return len;
	}
	public static double area(double r) {
		double area = 0;
		area = Math.PI * Math.pow(r, 2);
				return area;
	}
}