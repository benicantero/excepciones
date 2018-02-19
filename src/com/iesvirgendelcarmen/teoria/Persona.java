package com.iesvirgendelcarmen.teoria;

import java.time.LocalDate;

public class Persona {
	
	//atributos
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String dni;
	
	//constructuor
	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, String dni) throws DNIException {
		if (UtilidadesPersonas.validarDNI(dni)) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechaNacimiento = fechaNacimiento;
			this.dni = dni;
		}
		else
			throw new DNIException("DNI no valido");
	}

	//getters y settes
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return apellidos + ", " + nombre + ". DNI" + dni;
	}

		//hascode y equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	
	
}
