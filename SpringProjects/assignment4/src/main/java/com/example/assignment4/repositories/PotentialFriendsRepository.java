package com.example.assignment4.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment4.models.PotentialFriends;
import com.example.assignment4.models.User;


@Repository
public interface PotentialFriendsRepository extends CrudRepository<PotentialFriends, Long>{
	List<PotentialFriends> findAll();

}
