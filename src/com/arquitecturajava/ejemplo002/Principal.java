package com.arquitecturajava.ejemplo002;

public class Principal {

	public static void main(String[] args) {
		
		Galleta g1 = new Galleta("chocolate");
		Galleta g2 = new Galleta("vainilla");
		Galleta g3 = new Galleta("fresa");
		Galleta g4 = new Galleta("chocolate");
		
		PackDoble<Galleta> pack = new PackDoble<>(g1, g4);
		System.out.println(pack.getItem1().getSabor());
		
		//System.out.println(g1.equals(g4));
		System.out.println(pack.iguales());
		
	}

}
