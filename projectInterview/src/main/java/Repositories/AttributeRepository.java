package Repositories;

import Models.Attribute;


public class AttributeRepository extends EntityRepository<Attribute> {

	@Override
	protected String getAllEntityIdsQueryName() {
		return Attribute.GET_ALL_ATTRIBUTES_ID_QUERY;
	}

	@Override
	protected Class<Attribute> getEntityClass() {
		return Attribute.class;
	}

	@Override
	protected String getAllEntityQueryName() {
		return Attribute.GET_ALL_ATTRIBUTES_QUERY;
	}

}
