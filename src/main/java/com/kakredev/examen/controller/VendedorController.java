package com.kakredev.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kakredev.examen.entidades.Vendedor;
import com.kakredev.examen.entidades.VendedorComision;
import com.kakredev.examen.entidades.VendedorMixto;
import com.kakredev.examen.servicios.AdminVentas;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {
	private final AdminVentas adminVentas = new AdminVentas();

	@PostMapping
	public void agregarVendedor(@RequestBody Vendedor vendedor) {

		if (vendedor.getTipo().equals("V")) {
			Vendedor v = new Vendedor(vendedor.getCedula(), vendedor.getTipo());
			v.setNumeroVentas(vendedor.getNumeroVentas());
			v.setSueldoFijo(vendedor.getSueldoFijo());
			v.setComisionPorVenta(vendedor.getComisionPorVenta());
			adminVentas.agregar(v);
			
		} else if (vendedor.getTipo().equals("C")) {
			VendedorComision vc = new VendedorComision(vendedor.getCedula());
			vc.setNumeroVentas(vendedor.getNumeroVentas());
			vc.setComisionPorVenta(vendedor.getComisionPorVenta());
			adminVentas.agregar(vc);
			
		} else if (vendedor.getTipo().equals("M")) {
			VendedorMixto vm = new VendedorMixto(vendedor.getCedula());
			vm.setNumeroVentas(vendedor.getNumeroVentas());
			vm.setSueldoFijo(vendedor.getSueldoFijo());
			adminVentas.agregar(vm);
		}
	}

	@GetMapping("/{cedula}")
	public Double calcularSueldoVendedor(@PathVariable String cedula) {
		return adminVentas.calcularSueldo(cedula);

	}
}
