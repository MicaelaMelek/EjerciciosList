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
		Integer numero;
		boolean continuar = false;
		Scanner in = new Scanner(System.in);
		
		do{
			System.out.println("Ingrese un opción:\n 1- Para agregar\n 2- Para Eliminar \n"
					+ "3- Para buscar un Teléfono\n 4 - Para buscar una Persona\n 5- Para editar un numero\n 6- Imprimir toda la lista\n 0- Para Salir\n \n");
			System.out.println("Ingrese un opcion:\n");
			opcion = in.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Ingrese el nombre:\n");
			nombre = in.next();
			System.out.println("Ingrese el telefono:\n");
			numero = in.nextInt();
			agenda.AgregarC(nombre, numero);
			break;

		case 6:
			System.out.println("Imprimiendo Agenda...\n");
			agenda.MostrarAgenda();
		default:
			break;
		}
		}while (opcion!=0);
	}

}
