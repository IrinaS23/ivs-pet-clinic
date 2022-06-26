package irina.learingspringframework.ivspetclinic.services;

import java.util.Set;

import irina.learingspringframework.ivspetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
