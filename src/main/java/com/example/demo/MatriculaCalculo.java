package com.example.demo;

public class MatriculaCalculo {
	
	public void realizarMatricula(String tipo) {
		if(tipo.equals("1")) {
			Materia mat = new Materia();
			mat.setNombre("Program");
			//INSERTAR EN LA BASE...
			System.out.println("Se inserto mat Program");
		}else {
			MateriaExtraordinaria matX= new MateriaExtraordinaria();
			matX.setNombre("Program");
			matX.setCantidadCreditos(10);
			//INSERTAR EN LA BASE...
			System.out.println("Se inserto matX Program");
		}
	}

}

