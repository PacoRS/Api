package restfull.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restfull.model.client;

import restfull.respository.clientRepository;

@Service
public class clientService {
	
	@Autowired
	clientRepository repository;
	
	public List<client> getAllNotes() {
		return repository.findAll();
	}
}
