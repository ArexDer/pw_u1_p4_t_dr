package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;

@Repository
public class CuentaRepositoryImpl implements CuentaRepository {

private static List<Cuenta> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Cuenta cuenta) {
		baseDatos.add(cuenta);
		
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.eliminar(cuenta.getNumero()); // PERDI EL DE MI MISMACEDULA
		this.insertar(cuenta);
		
	}

	@Override
	public void eliminar(String numero) {
		Cuenta cuenta = this.seleccionarPorNumero(numero);
		baseDatos.remove(cuenta);
		
	}

	@Override
	public Cuenta seleccionarPorNumero(String numero) {
		Cuenta cuentaEncontrada = new Cuenta();
		for (Cuenta cuenta : baseDatos) {
			// if (estu.getCedula().equals(cedula)) CASO ERROR -> SI UN ELEMENTO ES NULO ME
			// DA POINTER EXCEPTION
			if (numero.equals(cuenta.getNumero())) { // SIEMPRE EVALUAR PRIMERO ELEMENTO QUE NO SEA NULO
				cuentaEncontrada = cuenta;
				System.out.println(cuenta);
			}else { //	PRUEBAS
				//System.out.println("USUARIO NO EXISTENTE EN BASE DE DATOS");
			}

		}
		// BUENA PRACTICA -> UN METODO NO DEBERIA TENER DOS RETURNS POR BUENA PRACTICA

		return cuentaEncontrada;
	}

}
