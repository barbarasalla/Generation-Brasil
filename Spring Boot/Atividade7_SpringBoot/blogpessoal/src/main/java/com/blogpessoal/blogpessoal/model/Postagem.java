package com.blogpessoal.blogpessoal.model;


import java.time.LocalDateTime;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;
		
		@NotBlank(message = "Campo obrigatório!") 
		@Size(min = 5, max = 100)
		private String titulo;
		
		@NotBlank(message = "Campo obrigatório!")
		@Size(min = 10, max = 1000)
		private String texto;
		
		@UpdateTimestamp
		private LocalDateTime data;
		
		@ManyToOne							//Muitos para 1
		@JsonIgnoreProperties("postagem")	//Ignora o chamado e relaciona o atributo para vir junto com os outros no formato Json
		private Tema tema;				//NÃO ESQUECER DE FAZER OS GETs E SETs

		@ManyToOne							
		@JsonIgnoreProperties("postagem")	
		private Usuario usuario;		

	    public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Tema getTema() {
			return tema;
		}

		public void setTema(Tema tema) {
			this.tema = tema;
		}
		
	    public Long getId() {
	        return this.id;
	    }

		public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTitulo() {
	        return this.titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getTexto() {
	        return this.texto;
	    }

	    public void setTexto(String texto) {
	        this.texto = texto;
	    }

	    public LocalDateTime getData() {
	        return this.data;
	    }

	    public void setData(LocalDateTime data) {
	        this.data = data;
	    }

}



