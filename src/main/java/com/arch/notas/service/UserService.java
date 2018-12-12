package com.arch.notas.service;

import java.util.List;

import com.arch.notas.model.User;

public interface UserService {
	/**
	 * Guarda un usuario
	 * 
	 * @param user
	 * @return
	 */
	User save(User user);
	
	/**
	 * Recupera la lista de usuario
	 * @return lista de usuarios
	 */
	List<User> findAll();
}
