package repositories;

import java.util.Collection;

import models.AttributeValue;

public class AttributeValueRepository extends EntityRepository<AttributeValue> {

	@Override
	protected Class<AttributeValue> getEntityClass() {
		return AttributeValue.class;
	}

	@Override
	protected String getAllEntities() {
		return AttributeValue.GET_ALL_ATTRIBUTEVALUES_QUERY_NAME;
	}

	public Collection<AttributeValue> getValueByAttribute(String attribute) {
		return entityManager
				.createNamedQuery(AttributeValue.GET_ALL_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY_NAME, AttributeValue.class)
				.setParameter("attribute", attribute).getResultList();
	}

	public void deleteAttributeValues(long id) {
		entityManager
				.createNamedQuery(AttributeValue.DELETE_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY_NAME)
				.setParameter("id", id)
				.executeUpdate();
	}
	

}
