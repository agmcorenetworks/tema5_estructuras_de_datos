package es.corenetworks.dam.programacion.tema5.estructurasDeDatos.arrays;

import java.util.Scanner;

import es.corenetworks.dam.programacion.tema5.estructurasDeDatos.utilidades.Utilidades;

public class Ejercicio2 {
	
	
	public void rellenaArray(int[] array1) {
		
		for(int i = 0; i< array1.length; i++) {
			
			array1[i] = Utilidades.numerosAleatoriosEntreCeroYNueve();
		}
		
	
	}
	
	public int[] inicializaArray() {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del array");
		int tamaño = entrada.nextInt();
		entrada.close();
		
		return new int[tamaño];
	}
	
	
	public static void main (String [] args) {
		
		Ejercicio2 e2 = new Ejercicio2();
		
		
		int[] array1 = e2.inicializaArray();
		
		e2.rellenaArray(array1);
		Utilidades.muestraArrayInt(array1);
		System.out.println(Utilidades.sumaValoresArray(array1));
	}
}
