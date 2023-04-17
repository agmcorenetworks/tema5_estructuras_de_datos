package es.corenetworks.dam.programacion.tema5.estructurasDeDatos.arrays;

public class Ejercicio3 {
	static int[] prim = {1,2,3};
	static int[] seg = {1,2,3};
	
	static boolean isLaMismaArray(int[] primera, int[] segunda) {
		if (primera.length!=segunda.length)
			return false;
		else {
			for (int i=0;i<primera.length;i++) {
				if(primera[i]!=segunda[i]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLaMismaArray(prim, seg));
	}

}
