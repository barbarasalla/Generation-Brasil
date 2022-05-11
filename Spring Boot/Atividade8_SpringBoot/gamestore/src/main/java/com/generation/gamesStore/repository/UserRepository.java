package com.generation.gamesStore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.gamesStore.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{

	public Optional<UserModel> findByUser(String email);
	
}
