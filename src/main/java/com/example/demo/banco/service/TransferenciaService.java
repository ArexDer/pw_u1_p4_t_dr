package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaService {

	public void guardar(Transferencia transferencia);

	public void actualizar(Transferencia transferencia);

	public void borrar(String numero);

	public Transferencia buscarPorNumero(String numero);

	public void realizar(String cuentaOrigen, String cuentaDestino, BigDecimal monto);
	/*
	 * TENER LA HABILIDAD DE SABER QUE METODOS DEBO RECIBIR DEPENDIENDO DEL CASO LOS
	 * METODOS DE NEGOCIO, LA MENOR CANTIDAD DE DATOS NECESARIOS SIEMPRE PENSAR EN
	 * UN ENFOQUE DE USUARIO...(INTERFAZ)
	 */

}
