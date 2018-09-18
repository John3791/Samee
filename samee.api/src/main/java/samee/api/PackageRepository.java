package samee.api;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface PackageRepository extends SameeRepository<Package, UUID> {

}
