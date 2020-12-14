package com.pipecode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<List<Producto>> getAll(){
		return new ResponseEntity<List<Producto>>(productoService.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("producto")
	public ResponseEntity<Producto> create(@RequestBody Producto p) {
		return new ResponseEntity<Producto>(productoService.create(p),HttpStatus.OK);
	}
	
	@PutMapping("producto")
	public Producto update(@RequestBody Producto p) {
		return productoService.update(p);
	}
	
	@DeleteMapping("producto/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable String id) {
		productoService.delete(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
