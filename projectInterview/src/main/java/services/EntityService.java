package Services;

import java.util.Collection;

public abstract class EntityService<T extends EntityRepository<E>, E extends GenericEntity> {

	public Collection<E> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public E getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public E create(E entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public E edit(long id, E entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public String del(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
