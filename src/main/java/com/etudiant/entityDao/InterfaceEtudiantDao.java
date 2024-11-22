package com.etudiant.entityDao;

import java.util.List;

public interface InterfaceEtudiantDao {
	
	void addEtudiantDao(InterfaceEtudiantDao u); 

	void deleteUniversite(InterfaceEtudiantDao u);

	void updateUniversite(InterfaceEtudiantDao u);

	List<InterfaceEtudiantDao> getAllEtudiant();
	
	InterfaceEtudiantDao getEtudiantDao();
	
	boolean existUniversite();

	boolean existUniversite(InterfaceEtudiantDao U);
	

}



