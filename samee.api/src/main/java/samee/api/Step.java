package samee.api;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Step {
	@Id
	private UUID id;
	private String name;
	private UUID workflowId;
	private int sequenceNumber;
	
	public Step (String name, UUID workflowId, int sequenceNumber) {
		this.name = name;
		this.id = UUID.randomUUID();
		this.workflowId = workflowId;
		this.sequenceNumber = sequenceNumber;
	}

	public UUID getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(UUID workflowId) {
		this.workflowId = workflowId;
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
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
