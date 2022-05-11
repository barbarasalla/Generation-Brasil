package com.generation.gamesStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.gamesStore.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long>{
	
	public List<ProductModel> findAllByNameContainingIgnoreCase(@Param("name") String name);

}
