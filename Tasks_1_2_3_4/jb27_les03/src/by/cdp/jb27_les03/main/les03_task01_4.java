package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class les03_task01_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Введите число: ");
		if (sc.hasNextInt())
		num = sc.nextInt();
		mes(num);
		
	}		
	
public static void mes(int number) {	
	int digit = 0;
	while (number != 0) {
		digit = number % 10;
		number = number / 10;
		if (digit % 2 == 0) {
		System.out.println("В числе есть четная цифра.");
		return;
		}
	}
		System.out.println("В числе нет четных цифр.");
}

}	
