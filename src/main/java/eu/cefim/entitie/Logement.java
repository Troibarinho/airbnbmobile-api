package eu.cefim.entitie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="logement")
public class Logement {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
	
	@NotNull
	@Size(max=100)
    private String titre;
	
	@Size(max=100)
    private String type;
	
	@Size(max=100)
    private String description;
	
	@NotNull
	@Size(max=100)
    private String adresse;
	
	@NotNull
	@Size(max=5)
    private Integer codePostal;
	
	@NotNull
	@Size(max=100)
    private String ville;
	
	@NotNull
	@Size(max=2)
    private Integer capacite;
	
	@NotNull
	@Size(max=4)
    private Integer prixNuit;
	
	@NotNull
	@Size(max=10000)
    private String urlImage;
	
	public Logement() {
		
	}

	public Logement(String titre, String type, String description, String adresse, int codePostal, String ville,
		int capacite, int prixNuit, String urlImage) {
		super();
		this.titre = titre;
		this.type = type;
		this.description = description;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.capacite = capacite;
		this.prixNuit = prixNuit;
		this.urlImage = urlImage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Integer getCapacite() {
		return capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}

	public Integer getPrixNuit() {
		return prixNuit;
	}

	public void setPrixNuit(Integer prixNuit) {
		this.prixNuit = prixNuit;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
