package com.kakredev.examen.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kakredev.examen.entidades.VendedorComision;

public class TestVendedorComisionJUnit {

	@Test
	public void deberiaCalcularSueldoPorComision() {

		VendedorComision vendedor = new VendedorComision("1757124670");

		vendedor.setNumeroVentas(10);
		vendedor.setComisionPorVenta(50);

		double resultado = vendedor.calcularSueldo();

		assertEquals(500, resultado);

	}

}