package by.cdp.jb27_les04.main;

import java.util.Random;
import java.util.Scanner;

public class les04_task02 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int k = 0;
		int n = 0;
		System.out.println("В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К");
		System.out.print("Введите значение N: ");
		while(!in.hasNextInt()) {
			System.out.print("Неверный формат" + "\n" + "Введите N: ");
			in.next();}
		    n = in.nextInt();
		System.out.print("Введите значение K: ");
		while(!in.hasNextInt()) {
			System.out.print("Неверный формат" + "\n" + "Введите K: ");
			in.next();}
		    k = in.nextInt();
		int[] mas = new int[n];
			enterArrayWithRandom(mas);
			printArray(mas,k);

	}
public static void enterArrayWithRandom(int[] mas) {
Random rand = new Random();
for (int i = 0; i < mas.length; i++) {
mas[i] = rand.nextInt(300);
	}
}


public static void printArray(int[] mas, int k) {
	int sum = 0;
	for (int i = 0; i < mas.length; i++) {
	if 	(mas[i] % k == 0) {
		sum = sum + mas[i];
	}
	System.out.print("mas[" + i + "]=" + mas[i] + "; ");
}
	System.out.println("\n" + "Cумма элементов кратных " + k + " - " + sum);
}

}


