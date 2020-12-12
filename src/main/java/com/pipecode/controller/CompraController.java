package com.pipecode.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public Collection<Compra> findAll(){
		return compraService.findAll();
	}
}
