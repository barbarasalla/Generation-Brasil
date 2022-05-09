package com.blogpessoal.blogpessoal.controller;

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

import com.blogpessoal.blogpessoal.model.Postagem;
import com.blogpessoal.blogpessoal.repository.PostagemRepository;
import com.blogpessoal.blogpessoal.repository.TemaRepository;


@RestController
@RequestMapping ("/postagens")
@CrossOrigin("*")							//Ver tudo independente da origem
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@Autowired
	private TemaRepository temaRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){			//"ResponseEntity<List>": Retornar uma lista do tipo postagem
		return ResponseEntity.ok(repository.findAll());		//"ResponseEntity": Retornar um objeto do tipo "ResponseEntity" passando ok (resposta HTTP)
	}														//E dentro do parentes(corpo) faz a requisição de todas as postagens
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> getById(@PathVariable Long id){
		return repository.findById(id)											//Método "findById" retorna por padrão um "optional" que vem populado ou nulo, nesse caso usa-se o ".map" e o ".orElse"
				.map(resp -> ResponseEntity.ok(resp))							//dentro do map tem uma "Lambda Expressions". A primeira referencia é o "Parameter Variables"; " -> " é o "lambda operator"; a segunda referência é o "Return Expression" 
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());	//SE O VALOR QUE ESTAMOS SOLICITANDO VEM NULO DEVOLVE UMA RESPOSTA HTTP
				/* Alternativa: .orElse(ResponseEntity.notFound().build()) */
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));	//Devido ao "ContainingIgnoreCase" ele devolve apenas lista, pois traz tudo que contém ignorando os maiusculos
	}
	
	@PostMapping
	public ResponseEntity<Postagem> post(@Valid @RequestBody Postagem postagem){	//"RequestBody" pega o objeto pelo corpo
		if (temaRepository.existsById(postagem.getTema().getId())) {
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(repository.save(postagem));								//Retornar para/na body
		}			
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();		
	}
	
	/*
	 ALTERNATIVA SEM A RELAÇÃO COM OUTRO REPOSITÓRIO:
	 
	 @PostMapping
	 public ResponseEntity<Postagem> post(@Valid @RequestBody Postagem postagem){	//"RequestBody" pega o objeto pelo corpo
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(repository.save(postagem));
	}
	*/
	
	@PutMapping
	public ResponseEntity<Postagem> put(@Valid @RequestBody Postagem postagem){	
	if (repository.existsById(postagem.getId())){
			
			if (temaRepository.existsById(postagem.getTema().getId())) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(repository.save(postagem));
			}
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			
		}			
			
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	/*
	 ALTERNATIVA SEM A RELAÇÃO COM OUTRO REPOSITÓRIO:
	 
	 @PutMapping
	 public ResponseEntity<Postagem> put(@Valid @RequestBody Postagem postagem){	//"RequestBody" pega o objeto pelo corpo
			return ResponseEntity.status(HttpStatus.OK)
					.body(repository.save(postagem));
	}
	*/
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		Optional<Postagem> postagem = repository.findById(id);
		
		if(postagem.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		repository.deleteById(id);
	}
	
	/*
	 ALTERNATIVA SEM A RELAÇÃO COM OUTRO REPOSITÓRIO:
	 
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){	
			repository.deleteById(id);
	}
	*/
	
}

