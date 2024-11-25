package com.ecole.entity;

public class Cours {
	
	
	private int id;
	private String nomCours;


public Cours() {
	super();
}


public Cours(int id, String nomCours) {
	super();
	this.id = id;
	this.nomCours = nomCours;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNomCours() {
	return nomCours;
}


public void setNomCours(String nomCours) {
	this.nomCours = nomCours;
}


@Override
public String toString() {
	return "Cours [id=" + id + ", nomCours=" + nomCours + ", getId()=" + getId() + ", getNomCours()=" + getNomCours()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}




}
