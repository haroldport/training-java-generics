package com.arquitecturajava.ejemplo004;

public class CajaProducto<T extends Producto> extends Caja<T> {
	
	public CajaProducto(int tope) {
		super();
		this.tope = tope;
	}

	public double precioTotal() {
		double total = 0;
		for(T t: lista) {
			total += t.getPrecio();
		}
		return total;
	}
	
}
