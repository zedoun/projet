package com.ecole.entity;

public class Etudiant {

	private int id_etudiant;
	 private String nom;
	    private String prenom;
	    private int age;
	    private String matricule;
	    private double moyenne;
	public Etudiant() {
	super();
	}
	public Etudiant(int id_etudiant, String nom, String prenom, int age, String matricule, double moyenne) {
	super();
	this.id_etudiant= id_etudiant;
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.matricule = matricule;
	this.moyenne = moyenne;
	}
	public int getid_etudiant() {
	return id_etudiant;
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
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public String getMatricule() {
	return matricule;
	}
	public void setMatricule(String matricule) {
	this.matricule = matricule;
	}
	public double getMoyenne() {
	return moyenne;
	}
	public void setMoyenne(double moyenne) {
	this.moyenne = moyenne;
	}
	@Override
	public String toString() {
		return "Etudiant [id_etudiant=" + id_etudiant + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", matricule=" + matricule + ", moyenne=" + moyenne + ", getid_etudiant()=" + getid_etudiant()
				+ ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getAge()=" + getAge()
				+ ", getMatricule()=" + getMatricule() + ", getMoyenne()=" + getMoyenne() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
