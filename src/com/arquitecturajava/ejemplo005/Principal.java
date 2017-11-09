package com.arquitecturajava.ejemplo005;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.setNombre("Pepe");
		
		Ingeniero i = new Ingeniero();
		i.setNombre("Ana");
		
//		andar(p);
//		andar(i);
		
		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(p);
		listaPersonas.add(i);
		andarTodas(listaPersonas);
		
		List<Ingeniero> listaIngenieros = new ArrayList<>();
		listaIngenieros.add(i);
		andarTodas(listaIngenieros);
		
		List<Persona> otraLista = clonarLista(listaPersonas);
		for(Persona p1: otraLista) {
			System.out.println(p1.getNombre());
		}

	}
	
	//metodo generico
	public static <T> List<T> clonarLista(List<T> miLista) {
		List<T> miListaNueva = new ArrayList<>();
		miListaNueva.addAll(miLista);
		return miListaNueva;
	}
	
	//metodo generico apoyandonos en los wildcard para aportar flexibilidad
	public static void andarTodas(List<? extends Persona> miLista) {
		for(Persona p: miLista) {
			p.andar();
		}
	}
	
	public static void andar(Persona p) {
		p.andar();
	}

}
