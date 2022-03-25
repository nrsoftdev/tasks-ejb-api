package nrsoft.tasks.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;



public class TextConnectorDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -641596740929238325L;

	private long connId;
	
	private String name;
	
	private String description;

	private String filename;
	
	private OffsetDateTime creationTime; 
	
	private String creationUser;
	
	private OffsetDateTime  changeTime;
	
	private String changeUser;

	/**
	 * @return the connId
	 */
	public long getConnId() {
		return connId;
	}

	/**
	 * @param connId the connId to set
	 */
	public void setConnId(long connId) {
		this.connId = connId;
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
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
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


}
