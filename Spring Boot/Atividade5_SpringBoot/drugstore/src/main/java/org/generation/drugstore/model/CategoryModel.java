package org.generation.drugstore.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categorys")
public class CategoryModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String nameCategory;
	
	@OneToMany (mappedBy= "category", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("category")
	private List<ProductModel> products;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public List<ProductModel> getProducts() {
		return products;
	}

	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}	

}
