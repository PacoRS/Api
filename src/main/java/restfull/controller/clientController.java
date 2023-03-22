package restfull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restfull.model.client;
import restfull.service.clientService;

@RestController
@RequestMapping("/client")
public class clientController {
	@Autowired
	clientService service;


	//Parte de notas
	@GetMapping("/clients")
	public ResponseEntity<List<client>> getAllNotes() {
		List<client> result = service.getAllNotes();
		return new ResponseEntity<List<client>>(result, new HttpHeaders(), HttpStatus.OK);
	}
}
