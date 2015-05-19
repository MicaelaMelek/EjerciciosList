package com.micaelamelek.TypeList;

import java.util.*;

public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AgendaTelefonos agenda = new AgendaTelefonos();
		int opcion;
		String nombre;
		Integer telefono;
		Scanner in = new Scanner(System.in);

		do {
			System.out
					.println("\nIngrese un opción:\n 1- Para agregar\n 2- Para Eliminar\n"
							+ "3- Para buscar un Teléfono\n 4 - Para buscar una Persona\n 5- Para editar un numero\n 6- Imprimir toda la lista\n 0- Para Salir\n \n");
			System.out.println("Ingrese un opcion:\n");
			opcion = in.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese el nombre:\n");
				nombre = in.next();
				System.out.println("Ingrese el telefono:\n");
				telefono = in.nextInt();
				agenda.AgregarC(nombre, telefono);
				break;

			case 2:
				System.out.println("Ingrese el nombre:\n");
				nombre = in.next();
				agenda.EliminarC(nombre);
				System.out.println("Se elimino el contacto: " + nombre);
				break;

			case 3:
				System.out.println("Ingrese el nombre a buscar: ");
				nombre = in.next();
				agenda.buscarTelefono(nombre);
				break;
			case 4:
				System.out.println("Ingrese el telefono a buscar: ");
				telefono = in.nextInt();
				agenda.buscarNombre(telefono);
				break;

			case 6:
				System.out.println("Imprimiendo Agenda...\n");
				agenda.MostrarAgenda();
			default:
				break;
			}
		} while (opcion != 0);
	}

}
