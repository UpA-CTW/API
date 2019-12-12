package models;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name=Attribute.GET_ALL_ATTRIBUTES_QUERY, query="SELECT a FROM Attribute a")
@NamedQuery(name=Attribute.GET_ALL_ATTRIBUTES_ID_QUERY, query="SELECT a.id FROM Attribute a")

public class Attribute extends GenericEntity {
	
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_ATTRIBUTES_QUERY = "Attribute.getAllAttributes";
	public static final String GET_ALL_ATTRIBUTES_ID_QUERY = "Attribute.getAllAttributeId";
	

	private String type;

	public Attribute() {
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
