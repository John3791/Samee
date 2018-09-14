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
//	private String type;
//	private UUID parentId;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="PackageId")
	private List<Workflow> workflows;
	
	public Package( ) {
		this.id = UUID.randomUUID();
	}
	
	public Package(String name, String type) {
		this.name = name;
//		this.type = type;
		this.id = UUID.randomUUID();
	}
	public Package(String name, String type, List<Workflow> workflows) {
		this.name = name;
//		this.type = type;
		this.workflows = workflows;
		this.id = UUID.randomUUID();
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

//	public String getType() {
//		return type;
//	}

//	public void setType(String type) {
//		this.type = type;
//	}
}
