package com.pipecode.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pipecode.model.ProductoCompra;
import com.pipecode.repository.ProductoCompraRepository;

@Service
public class ProductoCompraService implements Services {
	
	@Autowired
	private ProductoCompraRepository productoCompraRepository;
	
	public ProductoCompra create(ProductoCompra pc) {
		return this.productoCompraRepository.save(pc);
	}
}
