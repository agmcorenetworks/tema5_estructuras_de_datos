package es.corenetworks.dam.programacion.tema5.estructurasDeDatos.arrays;

import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = new int[array1.length];
		
		for(int i=array1.length-1; i >=0 ; i--) {
			array2[array1.length-1 - i] = array1[i];
		}
		
		System.out.println("Array1: " + Arrays.toString(array1));
		System.out.println("Array2 : " + Arrays.toString(array2));

	}

}
