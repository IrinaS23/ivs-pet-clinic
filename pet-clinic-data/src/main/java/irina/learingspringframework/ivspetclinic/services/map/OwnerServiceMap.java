package irina.learingspringframework.ivspetclinic.services.map;

import java.util.Set;

import irina.learingspringframework.ivspetclinic.model.Owner;
import irina.learingspringframework.ivspetclinic.services.CrudServices;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements CrudServices<Owner, Long>{

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Long id, Owner object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	
	

}
