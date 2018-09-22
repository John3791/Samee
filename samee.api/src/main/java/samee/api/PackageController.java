package samee.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${samee.api.endpoints.package}")
public class PackageController {
	
	private static final Logger logger = LoggerFactory.getLogger(PackageController.class);
	
	@Autowired
	PackageRepository packageRepository;
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET, produces = "application/json")
	public List<Package> findAll() {
		logger.trace("findAll()");
		return (List<Package>) packageRepository.findAll();
		
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET, produces="application/json", value="/{id}")
	public Optional<Package> getPackageById(@PathVariable String id) {
		logger.trace("findById(" + id + ")");
		return packageRepository.findById(UUID.fromString(id));
	}
}
