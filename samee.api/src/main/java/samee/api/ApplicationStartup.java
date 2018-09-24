package samee.api;

import java.util.Collections;
import java.util.UUID;

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
		logger.info("Initial list of root packages:");
		packageRepository.findAll().forEach(rootPackage -> {
			logger.info("Package: {}", rootPackage.getName());
//			rootPackage.getWorkflows().forEach(workflow -> {
//				logger.info("Workflow: {}", workflow.getName());
//			});
		});
		
		logger.info(" ");
		logger.info("Package tree from root packages:");
		packageRepository.findAll().forEach(rootPackage -> {
			logPackage(rootPackage, 0);
		});
		
		logger.info(" ");
		logger.info("Package tree from 'Sample' package:");
		logPackage(packageRepository.findById(UUID.fromString("c63446e0-6570-4f98-bb4b-0c2d07d29c40")).get(), 0);
	}
	
	private void logPackage(Package package_, int level) {
		String result = String.join("", Collections.nCopies(level, "    "));
		result += package_.getName();
		logger.info(result);
		level++;
		for(Package child: package_.getPackages()) {
			logPackage(child, level);
		}
	}
}
