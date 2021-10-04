package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("x: ");
		double x = entrada.nextDouble();

		System.out.print("y: ");
		double y = entrada.nextDouble();
		
		double result;
		String message = "";
		
		result = 6 * x / y;
		
		if(y == 0) result = 30 + x;
		if(x == 0) result = 3 / y;
		
		if(x == 0 && y == 0) {
			message = "Error";
			result = 0;
		}

		System.out.println("Result: " + result + " " + message);
		entrada.close();

	}

}
