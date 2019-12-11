package Repositories;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Models.GenericEntity;

public abstract class EntityRepository <T extends GenericEntity>{

	@PersistenceContext
	protected EntityManager entityManager;
	
	protected abstract String getAllEntityIdsQueryName();
	
	protected abstract Class<T> getEntityClass();
	
	protected abstract String getAllEntityQueryName();
	
	public T createEntity(T entity) {
		return entityManager.merge(entity);
	}
	
	public Collection<T> getAllEntity() {
		return entityManager.createNamedQuery(getAllEntityQueryName(),getEntityClass()).getResultList();
	}
	
	public T consultEntity(long id) {
		return entityManager.find(getEntityClass(), id);
	}
	
	public T modID(T editedEntity) {
		return entityManager.merge(editedEntity);
	}
	
	public void remID(long id) {
		T entity = entityManager.find(getEntityClass(), id);
		entityManager.remove(entity);
	}
	
	
}
	
