package services;

import javax.transaction.Transactional;

import models.Attribute;
import repositories.AttributeRepository;

public class AttributeService extends EntityService<AttributeRepository, Attribute>{

	@Override
	@Transactional
	public Attribute edit(long id, Attribute entity) {
		Attribute attribute = repository.consultEntity(id);
		entity.setId(id);
		if(entity.getType() == null) {
			entity.setType(attribute.getType());
		}
		return repository.editEntity(entity);
	}

}
