package by.cdp.jb27_les04.main;

//import java.util.Random;
//import java.util.Scanner;

public class les04_task04 {
	
	public static void main(String[] args) {
		//Scanner in = new Scanner (System.in);

		System.out.println("В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.");

		int[] mas;
		mas = new int[10];
		
		mas[0] = 1;
		mas[1] = 2;
		mas[2] = 0;//0
		mas[3] = 4;
		mas[4] = 5;
		mas[5] = 0;//0
		mas[6] = 0;//
		mas[7] = 7;
		mas[8] = 0; //0
		mas[9] = 5;
		
		//printArray(mas);
		checkArray(mas);
		
		int[] mas1;
		mas1 = new int[checkArray(mas)];
		int k = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				mas1[k] = i;
				k = k + 1;
						}
					}
		
		printArray(mas1);
	}

public static void printArray(int[] mas) {
	for (int i = 0; i < mas.length; i++) {

	System.out.println("mas[" + i + "]=" + mas[i]);
		}
	
}


public static int checkArray(int[] mas) {
	int count = 0;
	for (int i = 0; i < mas.length; i++) {
		if (mas[i] == 0) {
			count = count + 1;
					}
				}
	//System.out.println(count);
	return count;
	
}

}


