package repositories;

import models.Attribute;


public class AttributeRepository extends EntityRepository<Attribute> {

	@Override
	protected Class<Attribute> getEntityClass() {
		return Attribute.class;
	}

	@Override
	protected String getAllEntities() {
		return Attribute.GET_ALL_ATTRIBUTES_QUERY_NAME;
	}

//	@Override
//	public Collection <Attribute> getByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
