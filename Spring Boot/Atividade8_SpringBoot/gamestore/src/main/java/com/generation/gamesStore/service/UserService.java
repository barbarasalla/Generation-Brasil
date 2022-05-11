package com.generation.gamesStore.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.gamesStore.model.UserLogin;
import com.generation.gamesStore.model.UserModel;
import com.generation.gamesStore.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Optional<UserModel> registerUsuario(UserModel user){
		if(userRepository.findByUser(user.getUser()).isPresent())
			return Optional.empty();
		user.setPassword(criptografarSenha(user.getPassword()));
		
		return Optional.of(userRepository.save(user));
	}
	
	public Optional<UserModel> updateUser(UserModel usuario) {
		
		if(userRepository.findById(usuario.getId()).isPresent()) {	
			
			Optional<UserModel> buscaUsuario = userRepository.findByUser(usuario.getUser());
		
			if ( (buscaUsuario.isPresent()) && ( buscaUsuario.get().getId() != usuario.getId()))
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário já existe!", null);

			usuario.setPassword(criptografarSenha(usuario.getPassword()));
	
			return Optional.ofNullable(userRepository.save(usuario));			
		}
		
		return Optional.empty();
	}		

	public Optional<UserLogin> authenticateUser(Optional<UserLogin> userLogin) {

		Optional<UserModel> user = userRepository.findByUser(userLogin.get().getUser());

		if (user.isPresent()) {
		
			if (compararSenhas(userLogin.get().getPassword(), user.get().getPassword())) {
	
				userLogin.get().setId(user.get().getId());
				userLogin.get().setName(user.get().getName());
				userLogin.get().setPhoto(user.get().getPhoto());
				userLogin.get().setToken(gerarBasicToken(userLogin.get().getUser(), userLogin.get().getPassword()));
				userLogin.get().setPassword(user.get().getPassword());
			
				return userLogin;
			}
		}	
		return Optional.empty();		
	}

	private String criptografarSenha(String password) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.encode(password);
	}
	

	private boolean compararSenhas(String senhaDigitada, String senhaBanco) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.matches(senhaDigitada, senhaBanco);
	}

	private String gerarBasicToken(String user, String password) {

		String token = user + ":" + password;
		byte[] tokenBase64 = Base64.encodeBase64(token.getBytes(Charset.forName("US-ASCII")));
		return "Basic " + new String(tokenBase64);
	}

}
