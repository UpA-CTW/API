package repositories;
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
	
	public AttributeValue getValueByAttribute(String attribute) {
		return entityManager
				.createNamedQuery(AttributeValue.GET_ALL_ATTRIBUTEVALUE_BY_ATTRIBUTE_QUERY, AttributeValue.class)
				.setParameter("attribute", attribute)
				.getSingleResult();
	}

//	@Override
//	public Collection<AttributeValue> getByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
