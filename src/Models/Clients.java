package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Clients {		
	public Clients(String nom, String prenom, String adresse, String email, String motpasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.motpasse = motpasse;
	}
	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static  String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public static String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public static String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static String getMotpasse() {
		return motpasse;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Clients.id = id;
	}
	public void setMotpasse(String motpasse) {
		this.motpasse = motpasse;
	}
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
    private static int id;
	private  static String nom;
	private static String prenom;
	private static String adresse;
	private static String email;	
	private  static String motpasse;
	

}
