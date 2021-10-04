package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Pintuacion: ");
		int puntuacion = input.nextInt();

		String veredicto;

		switch (puntuacion) {
		case 1:
			veredicto = "Mala";
			break;

		case 2:
			veredicto = "Regular";
			break;

		case 3:
			veredicto = "Buena";
			break;

		case 4:
			veredicto = "Excelente";
			break;

		case 5:
			veredicto = "Obra Maestra";
			break;

		default:
			veredicto = "No hay veredicto";
			break;
		}

		System.out.println("Veredicto: " + veredicto);

		input.close();

	}

}
