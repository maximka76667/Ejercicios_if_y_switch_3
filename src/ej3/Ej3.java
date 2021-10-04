package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Numero: ");
		double numero = entrada.nextDouble();
		
		if (numero < 0) numero = numero - numero * 2;

		System.out.println("Numero absoluto: " + numero);

		entrada.close();
	}

}
