package by.cdp.jb27_les02.main;

import java.util.Scanner;

public class les02_task02 {
	public static void main(String[] args) {
	double x = 0;
	double a = 0;
	double b;
	double c;
	Scanner in = new Scanner (System.in);
	
	while(a == 0) {
	System.out.print("Введите a: ");
	
	while(!in.hasNextDouble()) {
		System.out.print("Неверный формат" + "\n" + "Введите a: ");
		in.next();
	}
		a = in.nextDouble();
		if (a == 0) {
    	System.out.println("при a = 0 уравнение не имеет решения, т.к. нельзя делить на 0");
    	//return;
    }
	}
		
	System.out.print("Введите b: ");
	while(!in.hasNextDouble()) {
		System.out.print("Неверный формат" + "\n" + "Введите b: ");
		in.next();
	}
	b = in.nextDouble();
	System.out.print("Введите c: ");
	while(!in.hasNextDouble()) {
		System.out.print("Неверный формат" + "\n" + "Введите c: ");
		in.next();
	}
	c = in.nextDouble();
	
    double temp1 = 0;
    double temp2 = 0;
    double temp3 = 0;
    double temp4 = 0;
    
    temp1 = Math.pow(b,2) + (4 * a * c);
    
    if (temp1 <0) {
    	System.out.println("при a=" + a + ", b=" + b + " и c=" + c + " уравнение не имеет решения, т.к. невозможно извлечь корень из отрицательного числа");
    	return;
    }
    temp2 = Math.sqrt(temp1);
    temp3 = b + temp2 / (2 * a);
    temp4 = Math.pow(a,3) * c + b;
    x = temp3 - temp4;
        

    System.out.println ("при a=" + a + ", b=" + b + " и c=" + c + " x=" + x);
	}
	
	
	
}