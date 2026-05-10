package com.kakredev.examen.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kakredev.examen.entidades.VendedorMixto;

public class TestVendedorMixtoJUnit {

	@Test
	public void deberiaCalcularSueldoMixto() {

		VendedorMixto vendedor = new VendedorMixto("1757124670");

		vendedor.setSueldoFijo(500);
		vendedor.setNumeroVentas(10);

		double resultado = vendedor.calcularSueldo();

		assertEquals(550, resultado);

	}

}