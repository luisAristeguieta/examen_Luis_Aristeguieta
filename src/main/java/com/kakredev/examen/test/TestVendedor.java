package com.kakredev.examen.test;

import com.kakredev.examen.entidades.Vendedor;

public class TestVendedor {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("1757124670");

		vendedor.setNumeroVentas(10);
		vendedor.setSueldoFijo(500);
		vendedor.setComisionPorVenta(20);

		System.out.println(vendedor);

	}

}
