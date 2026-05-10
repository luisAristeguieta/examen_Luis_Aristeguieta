package com.kakredev.examen.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kakredev.examen.entidades.Vendedor;

public class TestVendedorJUnit {

	@Test
	public void deberiaCalcularSueldoFijo() {

		Vendedor vendedor = new Vendedor("1757124670");

		vendedor.setSueldoFijo(500);

		double resultado = vendedor.calcularSueldo();

		assertEquals(500, resultado);

	}

}