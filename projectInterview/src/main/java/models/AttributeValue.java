package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name=AttributeValue.GET_ALL_ATTRIBUTEVALUES_QUERY_NAME, query="SELECT v FROM AttributeValue v")
@NamedQuery(name=AttributeValue.GET_ALL_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY_NAME, query="SELECT v FROM AttributeValue v WHERE v.attribute.category = :attribute")
@NamedQuery(name=AttributeValue.DELETE_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY_NAME, query="DELETE FROM AttributeValue v WHERE v.attribute.id = :id")
public class AttributeValue extends GenericEntity{
	
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_ATTRIBUTEVALUES_QUERY_NAME = "AtributeValue.getAllAttributeValues";	
	public static final String GET_ALL_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY_NAME = "AttributeValue.getValueByAttribute";
	public static final String DELETE_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY_NAME = "AttributeValue.DeleteValuesByAttribute";
	
	
	@ManyToOne
	private Attribute attribute;
	private String value;
	
	public AttributeValue() {
		
	}
	
	public AttributeValue(Attribute attribute, String value) {
		this.attribute = attribute;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

}
