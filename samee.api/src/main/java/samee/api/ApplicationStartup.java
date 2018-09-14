package samee.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationRunner {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationStartup.class);
	
	@Autowired
	PackageRepository packageRepository;
	
	@Override
	public void run (ApplicationArguments args) throws Exception {
		logger.info("================================================================================");
		logger.info("Samee started with options: {}", args.getSourceArgs());
		logger.info("================================================================================");
		afterStartup();
	}
	
	private void afterStartup() {
		
		packageRepository.findAll().forEach(rootPackage -> {
			logger.info("Package: {}", rootPackage.getName());
			rootPackage.getWorkflows().forEach(workflow -> {
				logger.info("Workflow: {}", workflow.getName());
			});
		});
		
	}
}
