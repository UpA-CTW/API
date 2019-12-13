package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name=AttributeValue.GET_ALL_ATTRIBUTEVALUE_QUERY, query="SELECT v FROM AttributeValue v")
@NamedQuery(name=AttributeValue.GET_ALL_ATTRIBUTEVALUE_ID_QUERY, query="SELECT v.id FROM AttributeValue v")

@NamedQuery(name=AttributeValue.GET_ALL_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY, query="SELECT v FROM AttributeValue v WHERE v.attribute = :attribute")

public class AttributeValue extends GenericEntity{
	
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_ATTRIBUTEVALUE_QUERY = "AtributeValue.getAllAttributeValue";
	public static final String GET_ALL_ATTRIBUTEVALUE_ID_QUERY = "AttributeValue.getAllAttributeValueId";
	
	public static final String GET_ALL_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY = "AttributeValue.getValueByAttribute";
	
	
	private String value;
	
	@ManyToOne
	private Attribute attribute;
	
	
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
