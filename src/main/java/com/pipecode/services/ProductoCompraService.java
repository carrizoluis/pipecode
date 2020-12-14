package com.pipecode.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
	public ProductoCompra update(ProductoCompra pc) {
		return this.productoCompraRepository.save(pc);
	}
	
	public ProductoCompra delete(ProductoCompra pc) {
		pc.setBorrado(true);
		return this.productoCompraRepository.save(pc);
	}
	
	public List<ProductoCompra> findAll(){
		List<ProductoCompra> listaCompra = new ArrayList<ProductoCompra>();
		Iterator<ProductoCompra> iterator = this.productoCompraRepository.findAll().iterator();
		while(iterator.hasNext()) {
			ProductoCompra pc = iterator.next();
			listaCompra.add(pc);
		}
		return listaCompra;
	}
}
