package nrsoft.tasks.dto;

public class StatusDTO {
	
	private String userId="";

	public StatusDTO(String userId) {
		super();
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
