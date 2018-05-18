package com.example.loginregistration.services;

import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.example.loginregistration.models.User;
import com.example.loginregistration.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public Boolean login(String email, String password, HttpSession session) {
		User user = userRepository.findByEmail(email);
		if(user != null) {
			System.out.println("Good email");
			if(BCrypt.checkpw(password, user.getPassword())) {
				session.setAttribute("user_id", user.getId());
				return true;
			} else {
			System.out.println("Bad email");
			return false;
			}
		}
		System.out.println("Bad email");
		return false;
	}
	
	public String saveUser(User user, String c_password, HttpSession session) {
		if(!user.getPassword().equals(c_password)) {
			System.out.println("Password don't match!");
			return "Password don't match!";
		} 
		if(userRepository.findByEmail(user.getEmail()) == null) {
			user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(10)));
			userRepository.save(user);
			session.setAttribute("user_id", user.getId());
			System.out.println("Success!");
			return "Success!";
		} else {
			System.out.println("An account with that email already exists!");
			return "An account with that email already exists!";
		}
	}

}
