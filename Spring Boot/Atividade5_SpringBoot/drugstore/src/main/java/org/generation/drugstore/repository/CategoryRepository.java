package org.generation.drugstore.repository;

import java.util.List;

import org.generation.drugstore.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <CategoryModel, Long> {

	public List<CategoryModel> findAllByNameContainingIgnoreCase(@Param("name") String name);
}
