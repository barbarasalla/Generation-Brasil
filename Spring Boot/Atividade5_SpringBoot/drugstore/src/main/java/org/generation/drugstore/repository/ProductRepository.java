package org.generation.drugstore.repository;

import java.util.List;

import org.generation.drugstore.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository <ProductModel, Long> {

	public List<ProductModel> findAllByNameContainingIgnoreCase(@Param("name") String name);
}
