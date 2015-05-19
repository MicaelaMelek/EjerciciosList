package com.micaelamelek.TypeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AgendaTelefonos {

	private Map<String, Integer> mAgenda;

	public AgendaTelefonos() {
		mAgenda = new TreeMap<String, Integer>();

	}

	public Map<String, Integer> getAgenda() {
		return mAgenda;
	}

	public void AgregarC(String nombre, int numero) {
		mAgenda.put(nombre, numero);
		System.out.println("Se agrego el contacto: " + nombre);
	}

	public void EliminarC(String nombre) {
		this.mAgenda.remove(nombre);
	}

	public void MostrarAgenda() {
		for (Map.Entry<String, Integer> entry : mAgenda.entrySet()) {
			System.out.println("Nombre: " + entry.getKey() + ". Telefono: "
					+ entry.getValue());
		}
	}

	public void buscarNombre(Integer telefono) {
		for (Entry<String, Integer> entry : mAgenda.entrySet()) {
			if (telefono.equals(entry.getValue())) {
				System.out.println("El telefono " + telefono + " es: "
						+ entry.getKey());

			} else {
				System.out.println("El telefono no existe");
			}

		}
	}

	public void buscarTelefono(String nombre) {

		for (Entry<String, Integer> entry : mAgenda.entrySet()) {
			if (nombre.equals(entry.getKey())) {
				System.out.println("El contacto " + nombre
						+ " le corresponde el telefono: " + entry.getValue());

			} else {
				System.out.println("El contacto no existe");
			}

		}

	}

}
