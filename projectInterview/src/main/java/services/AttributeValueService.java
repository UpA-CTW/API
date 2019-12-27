package services;

import java.util.Collection;

import javax.transaction.Transactional;

import models.AttributeValue;
import repositories.AttributeValueRepository;

public class AttributeValueService extends EntityService <AttributeValueRepository, AttributeValue> {

	@Override
	@Transactional
	public AttributeValue edit(long id, AttributeValue entity) {
			AttributeValue attributevalue = repository.consultEntity(id);
			entity.setId(id);
			if(entity.getValue() == null) {
				entity.setValue(attributevalue.getValue());
			}
			if(entity.getAttribute() == null) {
				entity.setAttribute(attributevalue.getAttribute());
			}
		return repository.editEntity(entity);
	}

	public Collection<AttributeValue> getByAttribute(String attribute) {
		return repository.getValueByAttribute(attribute);
	}

}
