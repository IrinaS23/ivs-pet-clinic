package irina.learingspringframework.ivspetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable{
	
	private Long id; //recommaned to use box type because they can be NULL ( hibernate recomandation)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
