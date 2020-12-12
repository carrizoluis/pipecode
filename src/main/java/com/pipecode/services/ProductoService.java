package com.pipecode.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pipecode.model.Producto;
import com.pipecode.repository.ProductoRepository;

@Service
public class ProductoService implements Services {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public Producto create(Producto p) {
		return productoRepository.create(p);
	}
	
	public Producto update(Producto p) {
		return productoRepository.update(p);
	}
	
	public void delete(Producto p) {
		p.setBorrado(true);
		productoRepository.update(p);
	}
	
	public Collection<Producto> findAll(){
		Collection<Producto> producto = new ArrayList<Producto>();
		java.util.Iterator<Producto> iterator = productoRepository.findAll().iterator();  
		while(iterator.hasNext()) {
			producto.add(iterator.next());
		}
		Predicate<Producto> p1 = p -> p.isBorrado() == false;		
		producto = producto.stream().filter(p1).collect(Collectors.toList());
		return producto;
	}
}
