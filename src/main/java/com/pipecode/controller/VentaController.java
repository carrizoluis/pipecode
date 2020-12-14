package com.pipecode.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pipecode.model.Venta;
import com.pipecode.services.VentaService;

/** Controlador para ventas.
 * 
 * @author Luis Alberto Carrizo
 *
 */
@RestController
@RequestMapping("/")
public class VentaController {
	
	@Autowired
	private VentaService ventaService;
	
	@GetMapping("venta")
	public ResponseEntity<Collection<Venta>> getAll(){
		return new ResponseEntity<Collection<Venta>>(ventaService.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("venta")
	public ResponseEntity<Venta> create(@RequestBody Venta v) {
		return new ResponseEntity<Venta>(ventaService.create(v), HttpStatus.OK);
	}
	
	@PutMapping("venta")
	public ResponseEntity<Venta> update(@RequestBody Venta v) {
		return new ResponseEntity<Venta>(ventaService.update(v), HttpStatus.OK);
	}
	
	@DeleteMapping("venta")
	public ResponseEntity<Venta> delete(@RequestBody Venta v) {
		return new ResponseEntity<Venta>(ventaService.delete(v), HttpStatus.OK);
	}
}
