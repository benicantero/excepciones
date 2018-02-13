package com.iesvirgendelcarmen.teoria;

import java.time.LocalDate;
import java.time.Period;

public class UtilidadesPersonas {
	//metodo que nos diga si un dni es valido  o no
	
	public static boolean validarDNI(String dni) {
		String regexDNI = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
		if (!dni.toUpperCase().matches(regexDNI))
			return false;
		// 11111111H   --> length() = 9
		char letra 	  = dni.toUpperCase().charAt(dni.length() - 1); //H
		String numero = dni.substring(0, dni.length() - 1); //11111111
		int numeroDni = Integer.parseInt(numero);
		int posicion = numeroDni % 23;
		return letra == "TRWAGMYFPDXBNJZSQVHLCKE".charAt(posicion);
	}
	
	
	//metodo que nos indique si una fecha es valida o no
	//fecha futuro
	
	public static boolean validarFecha(LocalDate fecha) {
		Period period = Period.between(fecha, LocalDate.now());
		return period.getDays() >= 0 && period.getMonths() >= 0 && period.getYears() >= 0;
	}

}
