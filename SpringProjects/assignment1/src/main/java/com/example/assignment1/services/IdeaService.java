package com.example.assignment1.services;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.example.assignment1.models.Idea;
import com.example.assignment1.models.IdeasLikes;
import com.example.assignment1.repositories.IdeaRepository;
import com.example.assignment1.repositories.IdeasUsersRepository;

@Service
public class IdeaService {
	private final IdeaRepository ideaRepository;
	private final IdeasUsersRepository ideasUsersRepository;
	
	public IdeaService(IdeaRepository ideaRepository, IdeasUsersRepository ideasUsersRepository) {
		this.ideaRepository = ideaRepository;
		this.ideasUsersRepository = ideasUsersRepository;
	}
	
	public Idea createIdea(Idea idea, HttpSession session) {
		idea.setUser_id((Long) session.getAttribute("user_id"));
		return ideaRepository.save(idea);
	}
	
	public List<Idea> getAll() {
		return ideaRepository.findAll();
	}
	
	public Idea getIdea(Long id) {
		return ideaRepository.findOne(id);
	}

}
