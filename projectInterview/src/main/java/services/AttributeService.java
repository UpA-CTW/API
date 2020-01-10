package services;

import javax.inject.Inject;
import javax.transaction.Transactional;

import models.Attribute;
import repositories.AttributeRepository;

public class AttributeService extends EntityService<AttributeRepository, Attribute>{

	
	@Inject
	 protected AttributeValueService attributeValueService;
	
	@Override
	@Transactional
	public Attribute edit(long id, Attribute entity) {
		Attribute attribute = repository.consultEntity(id);
		entity.setId(id);
		if(entity.getCategory() == null) {
			entity.setCategory(attribute.getCategory());
		}
		return repository.editEntity(entity);
	}

	@Override
	@Transactional
	public void del(long id) {
		try {
			attributeValueService.deleteAttributeValues(id);
			repository.removeEntity(id);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to delete, this category is being used to classify one or more questions.");
		}
	}
	
}
