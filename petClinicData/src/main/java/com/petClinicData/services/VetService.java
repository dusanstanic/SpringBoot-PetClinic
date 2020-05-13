package com.petClinicData.services;

import java.util.Set;

import com.petClinicData.model.Vet;

public interface VetService {
	
 	Vet findById(long id);
 	
 	Vet save(Vet vet);
 	
 	Set<Vet> findAll();
	
}
