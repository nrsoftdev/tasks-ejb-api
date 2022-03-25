package nrsoft.tasks.dto;

import java.time.OffsetDateTime;
import java.util.LinkedList;
import java.util.List;

import nrsoft.tasks.model.TaskDefinition;

public class ProcessDefinitionDTO {
	
	public ProcessDefinitionDTO() {}
	
	private long processId;
	
	private long version;

	private String name;

	private String startBeanName;
	
	private String description;
	
	private String taskDefinitionName;
	
	private String taskDefinitionDescription;
	
	private long taskDefinitionId;

	private OffsetDateTime generationTime; 
	
	private String generationUser;

	private OffsetDateTime creationTime; 
	
	private String creationUser;
	
	private OffsetDateTime changeTime;

	private String changeUser;
	
	private List<ProcessDefinitionVariableDTO> variables = new LinkedList<>();
	
	// private String generatedCode;	


	/**
	 * @return the processId
	 */
	public long getProcessId() {
		return processId;
	}


	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(long processId) {
		this.processId = processId;
	}


	/**
	 * @return the version
	 */
	public long getVersion() {
		return version;
	}


	/**
	 * @param version the version to set
	 */
	public void setVersion(long version) {
		this.version = version;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the startBeanName
	 */
	public String getStartBeanName() {
		return startBeanName;
	}


	/**
	 * @param startBeanName the startBeanName to set
	 */
	public void setStartBeanName(String startBeanName) {
		this.startBeanName = startBeanName;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}




	/**
	 * @return the generationTime
	 */
	public OffsetDateTime getGenerationTime() {
		return generationTime;
	}


	/**
	 * @param generationTime the generationTime to set
	 */
	public void setGenerationTime(OffsetDateTime generationTime) {
		this.generationTime = generationTime;
	}


	/**
	 * @return the generationUser
	 */
	public String getGenerationUser() {
		return generationUser;
	}


	/**
	 * @param generationUser the generationUser to set
	 */
	public void setGenerationUser(String generationUser) {
		this.generationUser = generationUser;
	}


	/**
	 * @return the creationTime
	 */
	public OffsetDateTime getCreationTime() {
		return creationTime;
	}


	/**
	 * @param creationTime the creationTime to set
	 */
	public void setCreationTime(OffsetDateTime creationTime) {
		this.creationTime = creationTime;
	}


	/**
	 * @return the creationUser
	 */
	public String getCreationUser() {
		return creationUser;
	}


	/**
	 * @param creationUser the creationUser to set
	 */
	public void setCreationUser(String creationUser) {
		this.creationUser = creationUser;
	}


	/**
	 * @return the changeTime
	 */
	public OffsetDateTime getChangeTime() {
		return changeTime;
	}


	/**
	 * @param changeTime the changeTime to set
	 */
	public void setChangeTime(OffsetDateTime changeTime) {
		this.changeTime = changeTime;
	}


	/**
	 * @return the changeUser
	 */
	public String getChangeUser() {
		return changeUser;
	}


	/**
	 * @param changeUser the changeUser to set
	 */
	public void setChangeUser(String changeUser) {
		this.changeUser = changeUser;
	}


	/**
	 * @return the taskDefinitionName
	 */
	public String getTaskDefinitionName() {
		return taskDefinitionName;
	}


	/**
	 * @param taskDefinitionName the taskDefinitionName to set
	 */
	public void setTaskDefinitionName(String taskDefinitionName) {
		this.taskDefinitionName = taskDefinitionName;
	}


	/**
	 * @return the taskDefinitionDescription
	 */
	public String getTaskDefinitionDescription() {
		return taskDefinitionDescription;
	}


	/**
	 * @param taskDefinitionDescription the taskDefinitionDescription to set
	 */
	public void setTaskDefinitionDescription(String taskDefinitionDescription) {
		this.taskDefinitionDescription = taskDefinitionDescription;
	}


	/**
	 * @return the taskDefinitionId
	 */
	public long getTaskDefinitionId() {
		return taskDefinitionId;
	}


	/**
	 * @param taskDefinitionId the taskDefinitionId to set
	 */
	public void setTaskDefinitionId(long taskDefinitionId) {
		this.taskDefinitionId = taskDefinitionId;
	}


	/**
	 * @return the variables
	 */
	public List<ProcessDefinitionVariableDTO> getVariables() {
		return variables;
	}


	/**
	 * @param variables the variables to set
	 */
	public void setVariables(List<ProcessDefinitionVariableDTO> variables) {
		this.variables = variables;
	}
}
