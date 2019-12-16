package services;

import java.util.Collection;

import javax.inject.Inject;
import javax.transaction.Transactional;

import models.GenericEntity;
import repositories.EntityRepository;

public abstract class EntityService<T extends EntityRepository<E>, E extends GenericEntity> {
	
	@Inject
	 protected T repository;

	@Transactional
	public Collection<E> getAll() {
		return repository.getAll();
	}

	@Transactional
	public E getOne(long id) {
		return repository.consultEntity(id);
	}

	@Transactional
	public E create(E entity) {
		return repository.createEntity(entity);
	}

	@Transactional
	public E edit(long id, E entity) {
		return repository.editEntity(entity);
	}

	@Transactional
	public void del(long id) {
		repository.removeEntity(id);
	}

	@Transactional
	public Collection<E> getOneByName(String name) {
		return repository.getOneByName(name);
	}

}
