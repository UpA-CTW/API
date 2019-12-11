package Models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Attribute extends GenericEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private AttributeValue value;
	private String type;

	public Attribute() {
		
	}
	
	public Attribute(AttributeValue value, String type) {
		this.type = type;
		this.value = value;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
