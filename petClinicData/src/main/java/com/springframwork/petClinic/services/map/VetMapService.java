package com.springframwork.petClinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframwork.petClinic.model.Owner;
import com.springframwork.petClinic.model.Pet;
import com.springframwork.petClinic.model.Speciality;
import com.springframwork.petClinic.model.Vet;
import com.springframwork.petClinic.services.SpecialtyService;
import com.springframwork.petClinic.services.VetService;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialtyService specialtyService;

	public VetMapService(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {

		if (object != null) {
			if (object.getSpecialities().size() > 0) {
				object.getSpecialities().forEach(speciality -> {
					if (speciality.getId() == null) { // If not saved to database
						Speciality savedSpecialty = specialtyService.save(speciality);
						savedSpecialty.setId(savedSpecialty.getId());
					}
				});
			}
			return super.save(object);
		} else {
			return null;
		}
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
