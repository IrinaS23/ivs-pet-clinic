package irina.learingspringframework.ivspetclinic.services.map;

import java.util.Set;

import irina.learingspringframework.ivspetclinic.model.Vet;
import irina.learingspringframework.ivspetclinic.services.CrudServices;

public class VetServiceMap extends AbstractMapService<Vet, Long>  implements CrudServices<Vet, Long>{

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
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
	public Vet save(Long id, Vet object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
 
}
