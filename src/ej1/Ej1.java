package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tu accion: ");
		String act = input.nextLine();
		
		System.out.print("a: ");
		int a = input.nextInt();
		
		System.out.print("b: ");
		int b = input.nextInt();
		
		// Action
		
		double result;
		String message = "";
		
		switch (act) {
		case "+":
			result = a + b;
			break;

		case "-":
			result = a - b;
			break;

		case "*":
			result = a * b;
			break;

		case "/":
			result = a / b;
			break;
			
		case "%":
			result = a % b;
			break;
			
		case "%/":
			result = a / b - (a % b);
			break;

		default:
			result = 0;
			message = " Error";
			break;
		}
		
		System.out.println("Result: " + result + message);
		
		input.close();
	}

}
