package com.iesvirgendelcarmen.teoria;

import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("introduce nombre");
		String nombre = in.nextLine();
		System.out.println("introduce apellidos");
		String apellido = in.nextLine();
		if(!nombre.toLowerCase().matches("[a-zραινσϊό\\s]+") || !apellido.toLowerCase().matches("[a-zραινσϊό\\s]+")) {
			System.out.println("Nombre no vαlido");
			System.exit(1);// termina programa
		}
		System.out.println("introduce fecha dd/mm/aaaa");
		String fecha = in.nextLine();
		String regexDias = "(0[1-9]|[1-9]|[1-2][0-9]|3[0-1])";
		String regexMeses = "(0[1-9]|[1-9]|1[0-2])";
		String regexAnnos = "([0-9]{1,4})";
		if (!fecha.matches(regexDias + "/" + regexMeses + "/" + regexAnnos)) {
			System.out.println("Fecha no valida");
			System.exit(1);
		}
		System.out.println("introduce DNI con letra");
		String dni = in.nextLine();
		in.close();
	}

}
