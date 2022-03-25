package nrsoft.tasks.dto;

import java.time.OffsetDateTime;

public class JdbcConnectorDTO {
	
	
	private long connId;
	private String name;
	private String description;


    private String driver="";
	private String url="";
    private String dbuser="";
    private String password="";
    
	
	private OffsetDateTime creationTime; 
	private String creationUser;
	private OffsetDateTime  changeTime;
	private String changeUser;
	
	
    
    
   
    
	/**
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}
	/**
	 * @param driver the driver to set
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the user
	 */
	public String getDBUser() {
		return dbuser;
	}
	/**
	 * @param user the user to set
	 */
	public void setDBUser(String dbuser) {
		this.dbuser = dbuser;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

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
