package nrsoft.tasks.dto;

import java.time.OffsetDateTime;
import java.util.Map;


public class TaskDefinitionDTO {
	
	private long taskId;
	

	private String name;
	
	private String description;

	private String className;

	private String connectorName="";
	
	private Map<String,String> properties;

	private long children;
	
	private boolean allowsChildren = false;
	
	private OffsetDateTime creationTime; 
	
	private String creationUser;
	
	private OffsetDateTime  changeTime;
	
	private String changeUser;


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
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the connectorId
	 */
	public String getConnectorName() {
		return connectorName;
	}

	/**
	 * @param connectorId the connectorId to set
	 */
	public void setConnectorName(String connectorName) {
		this.connectorName = connectorName;
	}

	/**
	 * @return the properties
	 */
	public Map<String, String> getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	/**
	 * @return the children
	 */
	public long getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(long children) {
		this.children = children;
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
	 * @return the taskId
	 */
	public long getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(long taskId) {
		this.taskId = taskId;
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
	 * @return the allowsChildren
	 */
	public boolean isAllowsChildren() {
		return allowsChildren;
	}

	/**
	 * @param allowsChildren the allowsChildren to set
	 */
	public void setAllowsChildren(boolean allowsChildren) {
		this.allowsChildren = allowsChildren;
	}


}
