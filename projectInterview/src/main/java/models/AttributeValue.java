package models;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name=AttributeValue.GET_ALL_ATTRIBUTEVALUE_QUERY, query="SELECT av FROM AttributeValue av")
@NamedQuery(name=AttributeValue.GET_ALL_ATTRIBUTEVALUE_ID_QUERY, query="SELECT av.id FROM AttributeValue av")

public class AttributeValue extends GenericEntity{
	
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_ATTRIBUTEVALUE_QUERY = "AtributeValue.getAllAttributeValue";
	public static final String GET_ALL_ATTRIBUTEVALUE_ID_QUERY = "AttributeValue.getAllAttributeValueId";
	
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
