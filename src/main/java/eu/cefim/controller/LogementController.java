package eu.cefim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eu.cefim.entitie.Logement;
import eu.cefim.repository.LogementRepository;


@RestController
@RequestMapping(path="/api")
public class LogementController {
	
	@Autowired
	private LogementRepository logementRepository;
	
	@GetMapping(path="/logements")
	public List<Logement> getAllLogements() {
		return logementRepository.findAll();
	}
	
	@GetMapping(path="/logements/{id}")
	public Logement findTournoiById(@PathVariable Integer id) {
		return logementRepository.findById(id).get();
	}
	
	@GetMapping(path="/logements/ville")
	public List<Logement> findByVille(@RequestParam String q) {
		System.out.println(q);
		return logementRepository.findByVille(q);
	}

}
