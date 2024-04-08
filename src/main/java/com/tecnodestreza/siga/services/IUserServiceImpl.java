package com.tecnodestreza.siga.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnodestreza.siga.models.User;
import com.tecnodestreza.siga.repo.IUserRepo;


@Service
public class IUserServiceImpl implements IUserService{
	
	
	@Autowired
	IUserRepo UserRepo;
	



	@Transactional
	@Override
	public User guardarUsuario(User user) {
		// TODO Auto-generated method stub
		return UserRepo.save(user);
	}

}
