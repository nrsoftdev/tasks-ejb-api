package nrsoft.tasks.dto;

import java.time.OffsetDateTime;
import java.util.UUID;


public class ProcessDTO {
	
	public static final String CREATED = "10";
	public static final String RUNNING = "20";
	public static final String ENDED_OK = "30";
	public static final String ENDED_ERROR = "40";
	public static final String CLOSED = "90";
	
	private String processId;
	

	private String status;

	private OffsetDateTime  startTime; 

	private OffsetDateTime  endTime; 
	
	private String owner;
	
	private long processDefId;
	
	private long processDefVersion;
	
	private String resultMessage;
	
	/**
	 * @return the processId
	 */
	public String getProcessId() {
		return processId;
	}

	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the startTime
	 */
	public OffsetDateTime getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(OffsetDateTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public OffsetDateTime getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(OffsetDateTime endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the processDefId
	 */
	public long getProcessDefId() {
		return processDefId;
	}

	/**
	 * @param processDefId the processDefId to set
	 */
	public void setProcessDefId(long processDefId) {
		this.processDefId = processDefId;
	}

	/**
	 * @return the processDefversion
	 */
	public long getProcessDefVersion() {
		return processDefVersion;
	}

	/**
	 * @param processDefversion the processDefversion to set
	 */
	public void setProcessDefVersion(long processDefVersion) {
		this.processDefVersion = processDefVersion;
	}

	/**
	 * @return the resultMessage
	 */
	public String getResultMessage() {
		return resultMessage;
	}

	/**
	 * @param resultMessage the resultMessage to set
	 */
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

}
