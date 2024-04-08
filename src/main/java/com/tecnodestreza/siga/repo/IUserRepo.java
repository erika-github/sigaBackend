package com.tecnodestreza.siga.repo;

import org.springframework.data.repository.CrudRepository;

import com.tecnodestreza.siga.models.User;

public interface IUserRepo extends CrudRepository<User, Long>{

}
