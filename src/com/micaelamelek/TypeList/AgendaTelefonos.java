package com.micaelamelek.TypeList;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaTelefonos {
	
private Map<String,Integer> agenda;

public AgendaTelefonos(){
	this.agenda = new TreeMap<String, Integer>();
	
}

public Map<String,Integer> getAgenda(){
	return this.agenda;
}

public void AgregarC (String nombre, int numero){
	this.agenda.put(nombre, numero);
	System.out.println("Se agrego el contacto: "+nombre);
}

public void EliminarC (String nombre){
	this.agenda.remove(nombre);
}

public void MostrarAgenda(){
	for (Map.Entry<String,Integer> entry : agenda.entrySet()) {
	     System.out.println("Nombre: " + entry.getKey() + ". Telefono: " + entry.getValue());
}
}

public void buscarTelefono(String nombre){
	if(agenda.containsKey(nombre)){
		System.out.println("El telefono de: "+nombre+" , es: "+agenda.get(nombre));
		
	}
}

}
