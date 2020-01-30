package com.wcs.wildcircus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.wildcircus.entities.Session;
import com.wcs.wildcircus.repositories.SessionRepository;

@Service
public class SessionService {

	@Autowired
	private SessionRepository sessionRepository;

	public List<Session> getAll() {
		return (List<Session>) sessionRepository.findAll();
	}

	public Optional<Session> getOne(Long Id) {
		return sessionRepository.findById(Id);
	}

	public void addNew(Session session) {
		sessionRepository.save(session);
	}

	public void update(Session session) {
		sessionRepository.save(session);
	}

	public void delete(Long id) {
		sessionRepository.deleteById(id);
	}
}
