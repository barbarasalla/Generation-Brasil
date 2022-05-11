package com.generation.gamesStore.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.gamesStore.model.ProductModel;
import com.generation.gamesStore.repository.CategoryRepository;
import com.generation.gamesStore.repository.ProductRepository;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping("/All")
	public ResponseEntity<List<ProductModel>> GetAll(){
		return ResponseEntity.ok(productRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductModel> GetById(@PathVariable Long id){
		return productRepository.findById(id).map(resp-> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/title/{name}")
	public ResponseEntity<List<ProductModel>> GetByName (@PathVariable String name){
		return ResponseEntity.ok(productRepository.findAllByNameContainingIgnoreCase(name));
	}
	
	@PostMapping
	public ResponseEntity<ProductModel> post(@Valid @RequestBody ProductModel product){
		if(categoryRepository.existsById(product.getCategory().getId())) {
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(productRepository.save(product));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();	
	}
	
	@PutMapping
	public ResponseEntity<ProductModel> put(@Valid @RequestBody ProductModel product){
		if (productRepository.existsById(product.getId())) {
			
			if(categoryRepository.existsById(product.getCategory().getId())) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(productRepository.save(product));
			}
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<ProductModel> product = productRepository.findById(id);
		if(product.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		productRepository.deleteById(id);
	}
}
