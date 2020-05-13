package com.petClinicData.services;

import java.util.Set;

import com.petClinicData.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
 	Owner findById(long id);
 	
 	Owner save(Owner owner);
 	
 	Set<Owner> findAll();

}
