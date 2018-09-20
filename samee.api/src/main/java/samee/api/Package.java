package samee.api;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Package {
	@Id
	private UUID id;
	private String name;
	private String description;
	
	//	private String type;
//	private UUID parentId;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="PackageId")
	private List<Workflow> workflows;
	
	public Package( ) {
		this(UUID.randomUUID(), "New Package");
	}
	
	public Package(UUID id, String name) {
		this(id, name, null, null);
	}
	
	public Package(UUID id, String name, String description) {
		this(id, name, description, null);		
	}
	public Package(String name, String description, List<Workflow> workflows) {
		this(UUID.randomUUID(), name, description, workflows);
	}

	public Package(UUID id, String name, String description, List<Workflow> workflows) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.workflows = workflows;
	}

	public List<Workflow> getChildren() {
		return workflows;
	}

	public List<Workflow> getWorkflows() {
		return workflows;
	}
	public void setWorkflows(List<Workflow> workflows) {
		this.workflows = workflows;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public String getType() {
//		return type;
//	}

//	public void setType(String type) {
//		this.type = type;
//	}
}
