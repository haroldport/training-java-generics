package com.arquitecturajava.ejemplo004;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caja<T> implements Iterable<T> {

	protected List<T> lista = new ArrayList<>();
	protected int tope;

	public void add(T elemento) {
		if(lista.size() < tope) lista.add(elemento);
	}

	public void borrar(T elemento) {
		lista.remove(elemento);
	}

	@Override
	public Iterator<T> iterator() {
		return lista.iterator();
	}
	
	
	
}
