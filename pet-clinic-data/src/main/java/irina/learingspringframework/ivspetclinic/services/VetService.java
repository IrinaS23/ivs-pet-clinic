package irina.learingspringframework.ivspetclinic.services;

import java.util.Set;

import irina.learingspringframework.ivspetclinic.model.Vet;

public interface VetService {

	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
