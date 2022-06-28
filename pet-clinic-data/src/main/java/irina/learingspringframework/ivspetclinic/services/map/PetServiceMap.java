package irina.learingspringframework.ivspetclinic.services.map;

import java.util.Set;

import irina.learingspringframework.ivspetclinic.model.Pet;
import irina.learingspringframework.ivspetclinic.services.CrudServices;

public class PetServiceMap extends AbstractMapService<Pet, Long>  implements CrudServices<Pet, Long>{

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId() , object);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Long id, Pet object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
}
