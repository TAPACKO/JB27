package by.cdp.jb27_les01.main;

import java.util.Scanner; // импорт сканнера

public class les01_task05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double s = 0; // сумма
			System.out.print("Введите первое число: ");
				double a = in.nextDouble();
			System.out.print("Введите второе число: ");
				double b = in.nextDouble();
			System.out.print("Введите третье число: ");
				double c = in.nextDouble();
			System.out.print("Введите четвертое число: ");
				double d = in.nextDouble();
		s = a + b + c + d;
		System.out.println("Сумма чисел " + a + ", " + b + ", " + c + " и " + d + " равна " + s);
//in.close();
		}
}