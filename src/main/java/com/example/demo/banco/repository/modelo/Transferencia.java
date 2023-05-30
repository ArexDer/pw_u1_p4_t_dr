package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transferencia {
	private String numero;
	private BigDecimal monto;
	private LocalDateTime fecha;
	private Cuenta cuentaOrigen;
	private Cuenta cuentaD;
	
	//get y set
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Cuenta getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(Cuenta cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public Cuenta getCuentaD() {
		return cuentaD;
	}
	public void setCuentaD(Cuenta cuentaD) {
		this.cuentaD = cuentaD;
	}
	
	@Override
	public String toString() {
		return "Transferencia [numero=" + numero + ", monto=" + monto + ", fecha=" + fecha + ", cuentaOrigen="
				+ cuentaOrigen + ", cuentaD=" + cuentaD + ", getNumero()=" + getNumero() + ", getMonto()=" + getMonto()
				+ ", getFecha()=" + getFecha() + ", getCuentaOrigen()=" + getCuentaOrigen() + ", getCuentaD()="
				+ getCuentaD() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
