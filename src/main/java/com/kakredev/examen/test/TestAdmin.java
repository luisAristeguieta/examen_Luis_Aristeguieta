package com.kakredev.examen.test;

import com.kakredev.examen.entidades.Vendedor;
import com.kakredev.examen.entidades.VendedorComision;
import com.kakredev.examen.entidades.VendedorMixto;
import com.kakredev.examen.servicios.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {

		// Se Crea 3 tipos de vendedores, agrega a la admninitracion e imprimo
		AdminVentas admin = new AdminVentas();
		Vendedor vendedor = new Vendedor("1757124670","V");
		vendedor.setSueldoFijo(500); // nomal

		VendedorComision vendedorComision = new VendedorComision("1757124671"); // v comision
		vendedorComision.setNumeroVentas(10);
		vendedorComision.setComisionPorVenta(50);

		VendedorMixto vendedorMixto = new VendedorMixto("1757124672"); // V mixto
		vendedorMixto.setSueldoFijo(500);
		vendedorMixto.setNumeroVentas(10);

		admin.agregar(vendedor);
		admin.agregar(vendedorComision);
		admin.agregar(vendedorMixto);

		System.out.println(admin.calcularSueldo("1757124670"));
		System.out.println(admin.calcularSueldo("1757124671"));
		System.out.println(admin.calcularSueldo("1757124672"));

		System.out.println(admin.calcularSueldo("0"));

		//
		Vendedor vendedorSinDatos = new Vendedor("1757124670","V");
		System.out.println(vendedorSinDatos.getCedula());

	}

}