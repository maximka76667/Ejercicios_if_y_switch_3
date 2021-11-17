package ej5;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Ej5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio: ");
		double precio = entrada.nextDouble();
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

		System.out.print("Fecha de nacimiento (dd.mm.aaaa): ");
		String fecha_nacimiento = entrada.nextLine();
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String fecha_de_hoy = formatter.format(LocalDateTime.now());
		
		Date date_de_nacimiento = new Date();
		try {
			date_de_nacimiento = format.parse(fecha_nacimiento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date fecha_de_hoy = new Date();

		System.out.println((date_de_nacimiento.getTime() - fecha_de_hoy.getTime()) / 24);
		entrada.close();
	}

}
