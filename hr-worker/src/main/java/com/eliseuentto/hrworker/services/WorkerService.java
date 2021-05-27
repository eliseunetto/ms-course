package com.eliseuentto.hrworker.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eliseuentto.hrworker.entities.Worker;
import com.eliseuentto.hrworker.repositories.WorkerRepository;
import com.eliseuentto.hrworker.services.exceptions.ObjectNotFoundException;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository repository;
	
	@Transactional
	public List<Worker> findAll() {
		List<Worker> list = repository.findAll();
		return list;
	}

	@Transactional
	public Worker findById(Long id) {
		Optional<Worker> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ". Tipo: " + Worker.class.getName()));
	}
}
