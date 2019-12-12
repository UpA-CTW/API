package repositories;

import java.util.List;

import models.AttributeValue;

public class AttributeValueRepository extends EntityRepository<AttributeValue> {

	@Override
	protected String getAllEntityIdsQueryName() {
		return AttributeValue.GET_ALL_ATTRIBUTEVALUE_ID_QUERY;
	}

	@Override
	protected Class<AttributeValue> getEntityClass() {
		return AttributeValue.class;
	}

	@Override
	protected String getAllEntityQueryName() {
		return AttributeValue.GET_ALL_ATTRIBUTEVALUE_QUERY;
	}
	
	public List<AttributeValue> getValueByAttribute(String attribute) {
		return entityManager
				.createNamedQuery(AttributeValue.GET_ALL_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY, AttributeValue.class)
				.setParameter("attribute", attribute)
				.getResultList();
	}

}
