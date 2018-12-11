package by.cdp.jb27_les02.main;

import java.util.Scanner;

public class les02_task01 {
	public static void main(String[] args) {
		int n = 10; //количество итерация цикла
		
		Scanner sc = new Scanner(System.in);
		
		String max = "", min = "", str = ""; //объявляем переменные
		
		for (int i = 0; i < n; i++) { //начало цикла
			System.out.print("> "); //вывести сивол
			if (sc.hasNextLine()) { //проверяем, введено ли значение
				str = sc.nextLine(); //если введена, to str присваиваем введенное значение
			if (i == 0) { //и, если это первый шаг
				min = str; //то min присваиваем значение str
			}
			if (str.length() > max.length()) { //если длина str больше чем длина max
				max = str; // то max присваиваем значение str
			} else if (str.length() < min.length()) { //если длина str меньше чем длина min
				min = str; // to min присваиваем значение str
			}
		}
	}
		System.out.println("max string = " + max + " length=" + max.length()); //выводим результаты
		System.out.println("min string = " + min + " length=" + min.length()); //выводим результаты
} 
}