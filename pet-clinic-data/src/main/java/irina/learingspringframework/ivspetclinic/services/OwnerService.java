package irina.learingspringframework.ivspetclinic.services;


import irina.learingspringframework.ivspetclinic.model.Owner;

public interface OwnerService extends CrudServices<Owner, Long> {
	
	Owner findByLastName(String lastName);
	
}
