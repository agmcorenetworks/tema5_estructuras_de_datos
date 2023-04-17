package es.corenetworks.dam.programacion.tema5.estructurasDeDatos.arrays;

public class Ejercicio7 {
	Persona p1 = new Persona("Pepe","12345678E",12);
	Persona p2 = new Persona("Maria","12345678E",24);
	Persona p3 = new Persona("Jose","12345678E",45);
	Persona p4 = new Persona("Fulanito","12345678E",22);
	Persona p5 = new Persona("Manuel","12345678E",12);
	
	Persona[] arrayPersonas = {p3,p2,p1,p4,p5};
	
	Persona p6 = new Persona("Pepe","12345678E",12);
	
	// Este metodo utiliza el foreach para iterar sobre el array
	public void muestraArray(Persona[] arrayPersonas) {
		for (Persona persona : arrayPersonas) {
			System.out.println(persona);
		}
	}
	
	// Este metodo utiliza el foreach para iterar sobre el array
	public Persona mayorEdad() {
		Persona p = arrayPersonas[0];
		for (Persona persona : arrayPersonas) {
			if (persona.getEdad()>p.getEdad()) {
				p = persona;
			}
		}
		return p;
	}
	
	public static void main(String[] args) {
		Ejercicio7 e1 = new Ejercicio7();
		for (int i = 0; i < e1.arrayPersonas.length;i++) {
			if (e1.arrayPersonas[i].equals(e1.p6)) {
				System.out.println("La persona p6 se encuentra en la posicion: " + i);
			}
		}
		e1.muestraArray(e1.arrayPersonas);
		System.out.println(e1.mayorEdad());
	}
}



class Persona {
	private String nombre;
	private String dni;
	private int edad;
	
	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			Persona p = (Persona) obj;
			if (this.nombre.equals(p.nombre) && this.dni.equals(p.dni) && this.edad == p.edad) {
				return true;
			}
			return false;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
}
