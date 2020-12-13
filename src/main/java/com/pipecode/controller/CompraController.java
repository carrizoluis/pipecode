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

import com.pipecode.model.Compra;
import com.pipecode.services.CompraService;

@RestController
@RequestMapping("/")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@GetMapping("compra")
	public Collection<Compra> getAll(){
		return compraService.findAll();
	}
	
	@PostMapping("compra")
	public Compra create(@RequestBody Compra c) {
		return compraService.create(c);
	}
	
	@PutMapping("compra")
	public Compra update(@RequestBody Compra c) {
		return compraService.update(c);
	}
	
	@DeleteMapping("compra")
	public String delete(@RequestBody Compra c) {
		compraService.delete(c);
		return "Ok";
	}
}
