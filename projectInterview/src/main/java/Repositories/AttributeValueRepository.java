package Repositories;

import Models.AttributeValue;

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

}
