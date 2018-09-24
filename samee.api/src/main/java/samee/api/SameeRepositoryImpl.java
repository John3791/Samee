package samee.api;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.EntityManager;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

public class SameeRepositoryImpl <T, ID extends Serializable> 
	extends SimpleJpaRepository<T, ID> implements SameeRepository<T, ID> {
	
	private EntityManager entityManager;
	
	public SameeRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		this.entityManager = entityManager;
	}
	
	public SameeRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
	}
	
/*	@Transactional
	@Override
	public Optional<T> findById(String id) {
		return super.findById((ID) UUID.fromString(id));
	}
*/
}
