package by.cdp.jb27_les04.main;

//import java.util.Random;
//import java.util.Scanner;

public class les04_task03 {
	
	public static void main(String[] args) {
		//Scanner in = new Scanner (System.in);

		System.out.println("Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей");

		double[] mas;
		mas = new double[5];
		
/*		mas[0] = 1;
		mas[1] = 2;
		mas[2] = 3;
		mas[3] = 4;
		mas[4] = 5;*/
		
		mas[0] = 1;
		mas[1] = 2;
		mas[2] = 7;
		mas[3] = 4;
		mas[4] = 5;
		
		printArray(mas);
		checkArray(mas);

	}

public static void printArray(double[] mas) {
	for (int i = 0; i < mas.length; i++) {

	System.out.println("mas[" + i + "]=" + mas[i]);
		}
	
	}

public static void checkArray(double[] mas) {
	int i = 1;
	while (i < mas.length) {
		if (mas[i] < mas[i-1]) {
			System.out.println("\n" + "последовательность не является возрастающей");
			return;
		}
		else {
			i++;
		}
		
				}
	System.out.println("\n" + "последовательность является возрастающей");
	}

}


