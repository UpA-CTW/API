package repositories;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import models.GenericEntity;

public abstract class EntityRepository <T extends GenericEntity>{

	@PersistenceContext
	protected EntityManager entityManager;
	
	protected abstract Class<T> getEntityClass();
	
	protected abstract String getAllEntities();
	
	public T createEntity(T entity) {
		return entityManager.merge(entity);
	}
	
	public Collection<T> getAll() {
		return entityManager.createNamedQuery(getAllEntities(),getEntityClass()).getResultList();
	}
	
	public T consultEntity(long id) {
		return entityManager.find(getEntityClass(), id);
	}
	
	public T editEntity(T editedEntity) {
		return entityManager.merge(editedEntity);
	}
	
	public void removeEntity(long id) {
		T entity = entityManager.find(getEntityClass(), id);
		entityManager.remove(entity);
	}

	public abstract Collection<T> getOneByName(String name);

	
	
}
	
