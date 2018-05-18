package com.example.assignment4.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment4.models.PotentialFriends;
import com.example.assignment4.models.Friends;

@Repository
public interface FriendsRepository extends CrudRepository<Friends, Long>{
	

}
