package com.pipecode.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
	
	@Autowired
	private ProductoRepository productRepository;
	
	public Producto create(Producto p) {
		return productRepository.save(p);
	}
	
	public Producto update(Producto p) {
		return productoRepository.save(p);
	}
	
	public void delete(String id) {
		Optional<Producto> p = productoRepository.findById(Long.parseLong(id));
		p.get().setBorrado(true);
		productoRepository.save(p.get());
	}
	
	public List<Producto> findAll(){
		List<Producto> producto = new ArrayList<Producto>();
		java.util.Iterator<Producto> iterator = productoRepository.findAll().iterator();  
		while(iterator.hasNext()) {
			producto.add(iterator.next());
		}
		Predicate<Producto> p1 = p -> p.isBorrado() == false;		
		producto = producto.stream().filter(p1).collect(Collectors.toList());
		return producto;
	}
}
