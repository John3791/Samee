package samee.api;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="Package")
public class Package {
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Package getParent() {
		return parent;
	}

	public void setParent(Package parent) {
		this.parent = parent;
	}

	@Id
	private UUID id;
	private String name;
	private String shortDescription;
	private String longDescription;
	private UUID parentId;

	public UUID getParentId() {
		return parentId;
	}

	public void setParentId(UUID parentId) {
		this.parentId = parentId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ParentId")
	@JsonBackReference
	private Package parent;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="ParentId")
	@OrderBy("name ASC")
	@JsonManagedReference
	private List<Package> packages;

	public List<Package> getPackages() {
		return packages;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="PackageId")
	@OrderBy("name ASC")
	private List<Workflow> workflows;
	
	public Package( ) {
		this(UUID.randomUUID(), "New Package");
	}
	
	public Package(UUID id, String name) {
		this(id, name, null, null);
	}
	
	public Package(UUID id, String name, String shortDescription) {
		this(id, name, shortDescription, null);		
	}
	public Package(String name, String shortDescription, List<Workflow> workflows) {
		this(UUID.randomUUID(), name, shortDescription, workflows);
	}

	public Package(UUID id, String name, String shortDescription, List<Workflow> workflows) {
		this.id = id;
		this.name = name;
		this.shortDescription = shortDescription;
		this.workflows = workflows;
	}

	public Package(UUID id, String name, String shortDescription, String longDescription, Package parent, List<Workflow> workflows) {
		this.id = id;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.parent = parent;
		this.workflows = workflows;
	}

	public List<Package> getChildren() {
		return packages;
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

}
