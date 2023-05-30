package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.repository.modelo.Estudiante;

@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepository {

	private static List<Transferencia> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Transferencia transferencia) {
		baseDatos.add(transferencia);
		
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.eliminar(transferencia.getNumero()); // PERDI EL DE MI MISMACEDULA
		this.insertar(transferencia);
		
	}

	@Override
	public void eliminar(String numero) {
		Transferencia transferencia = this.seleccionarPorNumero(numero);
		baseDatos.remove(transferencia);
		
	}

	@Override
	public Transferencia seleccionarPorNumero(String numero) {
		Transferencia transferenciaEncontrada = new Transferencia();
		for (Transferencia transferencia : baseDatos) {
			// if (estu.getCedula().equals(cedula)) CASO ERROR -> SI UN ELEMENTO ES NULO ME
			// DA POINTER EXCEPTION
			if (numero.equals(transferencia.getNumero())) { // SIEMPRE EVALUAR PRIMERO ELEMENTO QUE NO SEA NULO
				transferenciaEncontrada = transferencia;
				System.out.println(transferencia);
			}else { //	PRUEBAS
				System.out.println("USUARIO NO EXISTENTE EN BASE DE DATOS");
			}

		}
		// BUENA PRACTICA -> UN METODO NO DEBERIA TENER DOS RETURNS POR BUENA PRACTICA

		return transferenciaEncontrada;
	}

}
