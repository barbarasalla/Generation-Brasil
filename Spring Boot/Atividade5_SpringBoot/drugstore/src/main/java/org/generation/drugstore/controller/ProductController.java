package org.generation.drugstore.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.drugstore.model.ProductModel;
import org.generation.drugstore.repository.ProductRepository;
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

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public ResponseEntity<List<ProductModel>> getAll(){
		return ResponseEntity.ok(productRepository.findAll());	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductModel> getById(@PathVariable Long id){
		return productRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/product/{name}")
	public ResponseEntity<List<ProductModel>> getByName(@PathVariable String name){
		return ResponseEntity.ok(productRepository.findAllByNameContainingIgnoreCase(name));
		
	}
	
	@PostMapping
	public ResponseEntity<ProductModel> post(@Valid @RequestBody ProductModel product){	//"RequestBody" pega o objeto pelo corpo
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(productRepository.save(product));
	}
	
	@PutMapping
	public ResponseEntity<ProductModel> put(@Valid @RequestBody ProductModel product){	
		return ResponseEntity.status(HttpStatus.OK).body(productRepository.save(product));
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping
	public void delete (@PathVariable Long id) {
		Optional<ProductModel> product = productRepository.findById(id);
		
		if (product.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		productRepository.deleteById(id);
	}

}
