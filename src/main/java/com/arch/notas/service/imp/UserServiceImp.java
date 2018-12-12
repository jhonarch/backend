package com.arch.notas.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arch.notas.dao.UserRepository;
import com.arch.notas.model.User;
import com.arch.notas.service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}
}
