package com.example.assignment4.services;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.example.assignment4.models.Friends;
import com.example.assignment4.models.PotentialFriends;
import com.example.assignment4.models.User;
import com.example.assignment4.repositories.FriendsRepository;
import com.example.assignment4.repositories.PotentialFriendsRepository;
import com.example.assignment4.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	private final PotentialFriendsRepository potentialFriendsRepository;
	private final FriendsRepository friendsRepository;
	
	public UserService(UserRepository userRepository, PotentialFriendsRepository potentialFriendsRepository, FriendsRepository friendsRepository) {
		super();
		this.userRepository = userRepository;
		this.potentialFriendsRepository = potentialFriendsRepository;
		this.friendsRepository = friendsRepository;
		
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
	
	public User findUserById(Long id) {
        return userRepository.findOne(id);
    }
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
//	public void sendRequest(PotentialFriends potentialFriend, HttpSession session) {
//		// System.out.println(user);
//		System.out.println(potentialFriend);
//		//potentialFriend.setPotential_friend(user);
//
//		potentialFriendsRepository.save(potentialFriend);
//	}
	
	public void sendRequest(PotentialFriends potentialFriend, HttpSession session) {
		System.out.println(potentialFriend);
		potentialFriend.setUser(userRepository.findUserById((long) session.getAttribute("user_id")));

		potentialFriendsRepository.save(potentialFriend);
	}
	
	public void addFriend(Friends friend, HttpSession session) {
		System.out.println(friend);
		friend.setUser(userRepository.findUserById((long) session.getAttribute("user_id")));

		friendsRepository.save(friend);
	}
	
	public List<PotentialFriends> getAllPotentialFriends() {
		return potentialFriendsRepository.findAll();
	}
	
	public void destroyPendingFriend(Long id) {
		potentialFriendsRepository.delete(id);
    }
	

}