package irina.learingspringframework.ivspetclinic.services;

import java.util.Set;

import irina.learingspringframework.ivspetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
