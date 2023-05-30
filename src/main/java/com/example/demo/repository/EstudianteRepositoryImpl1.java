package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl1 implements EstudianteRepository {

	private static List<Estudiante> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Estudiante estudiante) {
		baseDatos.add(estudiante); // mockeando insert
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.eliminar(estudiante.getCedula()); // PERDI EL DE MI MISMACEDULA
		this.insertar(estudiante);
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		Estudiante estuEncontrado = new Estudiante();
		for (Estudiante estu : baseDatos) {
			// if (estu.getCedula().equals(cedula)) CASO ERROR -> SI UN ELEMENTO ES NULO ME
			// DA POINTER EXCEPTION
			if (cedula.equals(estu.getCedula())) { // SIEMPRE EVALUAR PRIMERO ELEMENTO QUE NO SEA NULO
				estuEncontrado = estu;
				System.out.println(estu);
			}else { //	PRUEBAS
				System.out.println("USUARIO NO EXISTENTE EN BASE DE DATOS");
			}

		}
		// BUENA PRACTICA -> UN METODO NO DEBERIA TENER DOS RETURNS POR BUENA PRACTICA

		return estuEncontrado;
	}

	@Override
	public void eliminar(String cedula) {

		Estudiante estu = this.seleccionar(cedula);
		baseDatos.remove(estu);

	}
	
	public List<Estudiante> seleccionarTodos() {
	
		 //FORMA PROFE 
		  return baseDatos;
		  
		 
		/*
		List<Estudiante> lista = new ArrayList<>();
		for (Estudiante estu : baseDatos) {
		
			lista.add(estu);
		}
		
		return lista;
		*/
	
	}

}
