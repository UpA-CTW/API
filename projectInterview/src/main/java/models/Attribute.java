package models;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name=Attribute.GET_ALL_ATTRIBUTES_QUERY_NAME, query="SELECT a FROM Attribute a")

public class Attribute extends GenericEntity {
	
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_ATTRIBUTES_QUERY_NAME = "Attribute.getAllAttributes";
	

	private String category;

	public Attribute() {
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



	
	
}
