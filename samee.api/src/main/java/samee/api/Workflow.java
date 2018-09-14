package samee.api;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Workflow {
	@Id
	private UUID id;
	private String name;
	private UUID packageId;
//	@OneToMany
//	@JoinColumn(name="WorkflowId")
//	private List<Step> steps;
	
	public UUID getPackageId() {
		return packageId;
	}

	public void setPackageId(UUID packageId) {
		this.packageId = packageId;
	}

	public Workflow() {
		this.id = UUID.randomUUID();
	}
	
	public Workflow (String name) {
		this.name = name;
		this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
