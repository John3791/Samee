package samee.api;

import java.io.Serializable;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SameeRepository <T, ID extends Serializable > extends JpaRepository<T, ID> {

	Optional<T> findById(String id);
}
