package com.petClinicData.services;

import java.util.Set;

import com.petClinicData.model.Pet;

public interface PetService {

 	Pet findById(long id);
 	
 	Pet save(Pet pet);
 	
 	Set<Pet> findAll();
	
}
