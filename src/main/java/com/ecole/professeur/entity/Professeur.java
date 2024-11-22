package com.ecole.professeur.entity;

public class Professeur {
	 // Variables correspondant aux champs de la table Professeurs
    int id = 1;                    // Identifiant unique pour chaque professeur
    String nom = "Dupont";          // Nom du professeur
    String prenom = "Jean";         // Prénom du professeur
    String dateNaissance = "1980-02-15"; // Date de naissance (au format String)
    String email = "jean.dupont@ecole.fr"; // Email unique du professeur
    String telephone = "0612345678"; // Numéro de téléphone
    String adresse = "10 rue de la Liberté, Paris"; // Adresse complète
    String specialite = "Mathématiques"; // Spécialité du professeur
    String dateEmbauche = "2010-09-01"; // Date d'embauche du professeur (au format String)
    double salaire = 2500.00;
	
    
    
    
    public Professeur(int id, String nom, String prenom, String dateNaissance, String email, String telephone,
			String adresse, String specialite, String dateEmbauche, double salaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.specialite = specialite;
		this.dateEmbauche = dateEmbauche;
		this.salaire = salaire;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getDateNaissance() {
		return dateNaissance;
	}




	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getTelephone() {
		return telephone;
	}




	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}




	public String getAdresse() {
		return adresse;
	}




	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}




	public String getSpecialite() {
		return specialite;
	}




	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}




	public String getDateEmbauche() {
		return dateEmbauche;
	}




	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}




	public double getSalaire() {
		return salaire;
	}




	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}  
    
    
    
    
    
    
    
    
}
