package samee.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("package")
public class PackageController {
	
	@Autowired
	PackageRepository packageRepository;
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET, produces = "application/json")
	public List<Package> findAll() {
/*		List<Package> packages = new ArrayList<Package>();
		List<Workflow> workflows = new ArrayList<Workflow>();
		
		workflows.add(new Workflow("Inbound"));
		workflows.add(new Workflow("Outbound"));
		packages.add(new Package("IA1000XX - Business Process", "Business Process", workflows));
		packages.add(new Package("IA2000XX - Business Process", "Business Process"));
		workflows = new ArrayList<Workflow>();
		workflows.add(new Workflow("Badge Photo Sync"));
		workflows.add(new Workflow("Spark Photo Sync"));
		workflows.add(new Workflow("HCM Data Sync"));
		packages.add(new Package("Staff Data Services", "General", workflows));
		packages.add(new Package("WSS Scheduled Processes", "General"));
		packages.add(new Package("AIS Administrative Utilities", "General"));
*/
		return (List<Package>) packageRepository.findAll();
		
	}

}
