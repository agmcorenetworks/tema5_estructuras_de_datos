package es.corenetworks.dam.programacion.tema5.estructurasDeDatos.utilidades;

import java.util.Random;

public class Utilidades {
	
	public static int numerosAleatoriosEntreCeroYNueve() {
		Random rand = new Random();
		
		return rand.nextInt(10);
		
	}
	

	public static void muestraArrayInt(int[] array1) {
		

		for(int i = 0; i< array1.length; i++) {
			
			System.out.println(i + " : " + array1[i]);
		}
		
	}
	
	public static String sumaValoresArray(int[] array1) {
		
		int suma = 0;
		
		for(int i = 0; i< array1.length; i++) {
			
			suma += array1[i];
		}
		
		return "La suma de los valores del Array es: " + suma;
	}

}
