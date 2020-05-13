package com.springframwork.petClinic.services;

import java.util.Set;

import com.springframwork.petClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
