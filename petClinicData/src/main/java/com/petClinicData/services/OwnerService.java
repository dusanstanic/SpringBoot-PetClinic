package com.petClinicData.services;

import java.util.Set;

import com.petClinicData.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
