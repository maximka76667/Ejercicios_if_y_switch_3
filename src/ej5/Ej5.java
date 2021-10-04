package ej5;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ej5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio: ");
		double precio = entrada.nextDouble();

		System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
		String fecha_nacimiento = entrada.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("" + formatter.format(LocalDateTime.now()));
		entrada.close();
	}

}
