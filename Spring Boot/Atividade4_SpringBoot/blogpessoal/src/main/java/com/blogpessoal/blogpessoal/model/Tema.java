package com.blogpessoal.blogpessoal.model;

import java.util.List;


/*Java Persistence API(JDA) define como persistir dados em aplicativos Java. "O foco principal do JPA é a camada ORM.
O **JPA** simplifica o tratamento do modelo de Banco de dados Relacional nos aplicativos Java quando mapeamos cada Tabela para uma 
única Classe de entidade (Model). ssim como no SQL, precisamos criar Relacionamentos entre as tabelas, no JPA também precisamos criar 
**Relacionamentos entre as Classes** e desta forma construirmos os Relacionamentos entre as Tabelas no Banco de dados*/
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_temas")
public class Tema {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Esse campo precisa ser preenchido!")
	private String descricao;
	
	@OneToMany (mappedBy = "tema" , cascade = CascadeType.REMOVE)//Relacionar as postagens ligadas ao tema e Remover todas as postagens que estão relacionados com o tema quando o tema for apagado
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem;		//Retorno precisa ser lista que reverencia "muitos"
	

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
