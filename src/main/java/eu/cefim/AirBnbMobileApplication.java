package eu.cefim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import eu.cefim.entitie.Logement;
import eu.cefim.repository.LogementRepository;





@SpringBootApplication
public class AirBnbMobileApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(AirBnbMobileApplication.class, args);
	}
	
	@Autowired
	private LogementRepository logementRepository;
	
	@Bean
	public CommandLineRunner addData() {
		return (args) -> {
			
			
		/*	Logement logement1 = new Logement("Appartement de charme centre-ville de Tours","Appartement"
			,"Magnifique location dans le centre historique de Tours, Idéal pour découvrir la ville","13 rue de chateauneuf",
			"37000","Tours",4,100,"https://s-ec.bstatic.com/images/hotel/max1024x768/133/133790329.jpg");
			logementRepository.save(logement1); */
			
			Logement logement2 = new Logement("Appartement au coeur du centre ville de Blois","Appartement"
			,"Magnifique location dans le centre historique de Blois, Idéal pour découvrir la ville","1 avenue de la butte",
			"41000","Blois",4,80,"https://q-xx.bstatic.com/xdata/images/hotel/max500/172274914.jpg?k=e7d01ecba0db6f7302427443f1da534e65d3c874bf9f789178cf270d6f6c8956&o=");
			logementRepository.save(logement2);
			
			Logement logement3 = new Logement("Maison de caractère centre-ville de Tours","Maison"
			,"Magnifique location dans le centre historique de Tours, Idéal pour découvrir la ville","16 avenue grammont",
			"37000","Tours",6,120,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTC4uqyWLPcKLDd3oPAFdpWlDOp_9mlwEy3W-UFyL0ZYY-Kg4gg");
			logementRepository.save(logement3);
			
			Logement logement4 = new Logement("Maison de charme à Blois","Maison"
			,"Magnifique location dans le centre historique de Blois, Idéal pour découvrir la ville","5 bis rue de la croix rouge",
			"41000","Blois",6,100,"https://odis.homeaway.com/odis/listing/dd523f37-05b9-4d2c-a804-12160f525945.c10.jpg");
			logementRepository.save(logement4);
			
			
		};
		
	}
	

	
	
	
	
	

}
