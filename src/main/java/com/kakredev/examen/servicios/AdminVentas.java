package com.kakredev.examen.servicios;

import java.util.ArrayList;

import com.kakredev.examen.entidades.Vendedor;

public class AdminVentas {

	private ArrayList<Vendedor> vendedores = new ArrayList<>();

	public Vendedor buscarVendedor(String cedula) {
		Vendedor buscado = null;
		for (Vendedor v : vendedores) {
			if (v.getCedula().equals(cedula)) {
				buscado = v;
				break;
			}
		}
		return buscado;
	}

	public void agregar(Vendedor vendedor) {
		Vendedor agregado = buscarVendedor(vendedor.getCedula());
		if (agregado == null) {
			vendedores.add(vendedor);
		}
	}

	public Double calcularSueldo(String cedula) {
		Vendedor buscado = buscarVendedor(cedula);
		if (buscado != null) {
			return buscado.calcularSueldo();
		}
		return null;
	}

}