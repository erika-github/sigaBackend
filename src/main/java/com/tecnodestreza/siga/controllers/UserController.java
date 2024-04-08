package com.tecnodestreza.siga.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnodestreza.siga.models.User;
import com.tecnodestreza.siga.services.IUserService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = {"*"})
public class UserController {
	
@Autowired
IUserService userServ;
	
@PostMapping(path = "/saveUser/{user}/{password}")
public ResponseEntity<?> guardarUser(@PathVariable String user, @PathVariable String password) {
	
	User us= new User();
	
	us.setUser(user);
	us.setPassword(password);
	
	userServ.guardarUsuario(us);
	
	return new ResponseEntity<>(us, HttpStatus.CREATED);
}

}
