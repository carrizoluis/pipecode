package com.pipecode.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pipecode.model.Compra;
import com.pipecode.repository.CompraRepository;

@Service
public class CompraService implements Services {
	
	@Autowired
	private CompraRepository compraRepository;
	
	@Autowired
	private ProductoCompraService productoCompraService;
	
	public Compra create(Compra c) {
		c.getDetalle().forEach(pc -> this.productoCompraService.create(pc));
		return compraRepository.save(c);
	}
	
	public Compra update(Compra c) {
		return compraRepository.save(c);
	}
	
	public void delete(Compra c) {
		c.setBorrado(true);
		compraRepository.save(c);
	}
	
	public Collection<Compra> findAll(){
		Collection<Compra> producto = new ArrayList<Compra>();
		java.util.Iterator<Compra> iterator = compraRepository.findAll().iterator();  
		while(iterator.hasNext()) {
			producto.add(iterator.next());
		}
		Predicate<Compra> p1 = p -> p.isBorrado() == false;		
		producto = producto.stream().filter(p1).collect(Collectors.toList());
		return producto;
	}
}
