package com.generation.gamesStore.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.gamesStore.model.CategoryModel;
import com.generation.gamesStore.repository.CategoryRepository;


@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<CategoryModel>> GetAll(){
		return ResponseEntity.ok(categoryRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoryModel> GetById(@PathVariable Long id){
		return categoryRepository.findById(id).map(resp-> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/title/{name}")
	public ResponseEntity<List<CategoryModel>> GetByName(@PathVariable String name){
		return ResponseEntity.ok(categoryRepository.findAllByNameContainingIgnoreCase(name));
	}
	
	@PostMapping
	public ResponseEntity<CategoryModel> post(@RequestBody @Valid CategoryModel category){
			return ResponseEntity.status(HttpStatus.OK)
				.body(categoryRepository.save(category));
	}
	
	@PutMapping
	public ResponseEntity<CategoryModel> put(@Valid @RequestBody CategoryModel category){
		return categoryRepository.findById(category.getId())
				.map(resp -> ResponseEntity.status(HttpStatus.CREATED).body(categoryRepository.save(category)))
						.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<CategoryModel> tema = categoryRepository.findById(id);
		
		if(tema.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		categoryRepository.deleteById(id);
	}
}
