package samee.api;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PackageRepository extends SameeRepository<Package, UUID> {
	
	   @Query("SELECT p FROM Package p WHERE p.parentId IS NULL")
	    List<Package> findAll();


}
