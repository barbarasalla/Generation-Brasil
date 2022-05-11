package com.generation.gamesStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.gamesStore.model.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {
	
	public List<CategoryModel> findAllByNameContainingIgnoreCase(@Param("name") String name);

}
