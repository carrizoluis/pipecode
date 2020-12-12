package com.pipecode.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pipecode.model.Producto;
import com.pipecode.services.ProductoService;

@RestController
@RequestMapping("/")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("producto")
	public Collection<Producto> getAll(){
		return productoService.findAll();
	}
	
	@PostMapping("producto")
	public Producto create(@RequestBody Producto p) {
		return productoService.create(p);
	}
	
	@PutMapping("producto")
	public Producto update(@RequestBody Producto p) {
		return productoService.update(p);
	}
	
	@DeleteMapping("producto")
	public String delete(@RequestBody Producto p) {
		productoService.delete(p);
		return "Ok";
	}
}
