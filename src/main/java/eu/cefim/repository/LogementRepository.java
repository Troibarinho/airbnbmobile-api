package eu.cefim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.cefim.entitie.Logement;

public interface LogementRepository extends JpaRepository<Logement, Integer> {
	
	List<Logement> findByVille(String ville);
	
}
