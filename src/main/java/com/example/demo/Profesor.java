package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component //Le estoy delegando el control al Framework
public class Profesor {
	
	private String nombre;
	private String apellido;
	private LocalDateTime fech_nacimineto;
	private String cedula;
	
	
	public Profesor(String nombre, String apellido, LocalDateTime fech_nacimineto, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fech_nacimineto = fech_nacimineto;
		this.cedula = cedula;
	}
	
	
	public Profesor() {
		super();
	}


	//SET  GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFech_nacimineto() {
		return fech_nacimineto;
	}
	public void setFech_nacimineto(LocalDateTime fech_nacimineto) {
		this.fech_nacimineto = fech_nacimineto;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", fech_nacimineto=" + fech_nacimineto
				+ ", cedula=" + cedula + "]";
	}
	
	
	

}
