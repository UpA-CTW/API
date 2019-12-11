package Models;

import javax.persistence.Entity;

@Entity
public class AttributeValue extends GenericEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String value;
	
	public AttributeValue() {
		
	}
	
	public AttributeValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
