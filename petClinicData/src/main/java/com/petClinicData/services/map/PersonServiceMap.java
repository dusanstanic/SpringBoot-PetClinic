package com.petClinicData.services.map;

import java.util.Set;

import com.petClinicData.model.Person;
import com.petClinicData.services.CrudService;

public class PersonServiceMap extends AbstractMapService<Person, Long> implements CrudService<Person, Long> {

	@Override
	public Set<Person> findAll() {
		return super.findAll();
	}

	@Override
	public Person findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Person save(Person object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Person object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
